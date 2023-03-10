import React, { useEffect, useState } from 'react';
import { makeStyles } from 'tss-react/mui'
import TextField from '@mui/material/TextField';
import { Container,Paper,Button } from '@mui/material';


const useStyles = makeStyles((theme) => ({
    root: {
      '& > *': {
        margin: theme.spacing(1),
       
      },
    },
  }));

  
export default function Account() {
    const paperStyle={padding:'50px 20px', width:600,margin:"20px auto"}
    const[name,setName]=useState('')
    const[email,setEmail]=useState('')
    const[password,setPassword]=useState('')
    const[number,setNumber]=useState('')
    const[accounts,setAccounts]=useState([])
    const classes = useStyles();

    const handleClick=(e)=>{
        e.preventDefault()
        const account={name,email,password,number}
        console.log(account)
        fetch("http://localhost:8080/account/create",{
          method:"POST",
          headers:{"Content-Type":"application/json"},
          body:JSON.stringify(account)
    
      }).then(()=>{
        console.log("New Account added")
      })
    }
    useEffect(()=>{
        fetch("http://localhost:8080/account/readAll")
        .then(res=>res.json())
        .then((result)=>{
          setAccounts(result);
        }
      )
      },[])

  return (
    
        <Container>
            <Paper elevation = {3} style={paperStyle}>
                <h1 style={{color:"blue"}}><u>Add Account</u></h1>

    <form className={classes.root} noValidate autoComplete="off">
    
      <TextField id="outlined-basic" label="Name" variant="outlined" fullWidth
      value={name}
      onChange={(e)=>setName(e.target.value)}/>
      <TextField id="outlined-basic" label="Email" variant="outlined" fullWidth 
      value={email}
      onChange={(e)=>setEmail(e.target.value)}/>
      <TextField id="outlined-basic" label="Password" variant="outlined" fullWidth 
      value={password}
      onChange={(e)=>setPassword(e.target.value)}/>
      <TextField id="outlined-basic" label="Number" variant="outlined" fullWidth 
      value={number}
      onChange={(e)=>setNumber(e.target.value)}/>
      
      <Button variant="contained" onClick={handleClick}>SUBMIT</Button>

    </form>  
      </Paper>
      
      <h1>Accounts</h1>

    <Paper elevation={3} style={paperStyle}>

    {accounts.map(account=>(
    <Paper elevation={6} style={{margin:"10px",padding:"15px", textAlign:"left"}} key={account.idx}>
    Idx:{account.idx}<br/>
    Name:{account.name}<br/>
    Email:{account.email}<br/>
    Password:{account.password}<br/>
    Number:{account.number}

    </Paper>
    ))
    }
    </Paper>    

      

    </Container>
    
  );
}
