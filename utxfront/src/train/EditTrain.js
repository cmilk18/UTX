
import axios from 'axios'
import React, {  useEffect, useState } from 'react'
import { Link, useNavigate, useParams } from 'react-router-dom'

export default function EditTrain() {

    let navigate=useNavigate()

    const {id} = useParams()

    const [train,settrain]=useState({
        name:"",
        
    })

    const{name}=train

    const onInputChange=(e)=>{
        settrain({...train,[e.target.name]:e.target.value})
    };

    useEffect(()=>{
        loadTrain();
        // eslint-disable-next-line react-hooks/exhaustive-deps
    },[]);

    const onSubmit=async (e)=>{
        e.preventDefault();
        await axios.put(`http://localhost:8080/train/${id}`,train)
        navigate("/train")

    };

    const loadTrain = async()=>{
        const result = await axios.get(`http://localhost:8080/train/${id}`)
        settrain(result.data)
    }


  return <div className="container">
        <div className="row">
            <div className='col-md-6 offset-md-3 border rounded p-4 mt-2 shadow'>
                <h2 className="text-center m-4">Edit Train</h2>

                <form onSubmit={(e)=>onSubmit(e)}>
                <div className="mb-3">
                    <label htmlFor="Name" className="form-label">
                        Name
                    </label>
                    <input
                     type={"text"}
                     className="form-control"
                     placeholder="Enter your Trainname"
                     name="name"
                     value={name}
                     onChange={(e)=>onInputChange(e)}
                     />
                </div>
                
                <button type="submit" className="btn btn-outline-primary">SUBMIT</button>
                <Link type="submit" className="btn btn-outline-danger mx-2" to="/train">CANCEL</Link>
                </form>
            </div>
        </div>
    
    </div>
}
