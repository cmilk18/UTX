import React, { useEffect, useState } from 'react'
import axios from "axios"
import { Link} from 'react-router-dom'

export default function TrainHome() {

    const [trains,setTrains] = useState([])

    useEffect(()=>{
        loadTrains();
    },[]);

    const loadTrains=async()=>{
        const result = await axios.get("http://localhost:8080/train/all");
        setTrains(result.data);
    };

    const deleteTrain=async(id)=>{
        await axios.delete(`http://localhost:8080/train/${id}`);
        loadTrains()
    }

  return (
    <div className='container'>
        <div className='py-4'>
        <table className="table border shadow">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Name</th>
      
    </tr>
  </thead>
  <tbody>
    {
        trains.map((train,id)=>(
            <tr>
            <th scope="row" key={id}>{id+1}</th>
            <td>{train.name}</td>
            
            <td>
                <Link className="btn btn-primary mx-2" to={`/train/${train.id}`}>View</Link>
                <Link className="btn btn-outline-primary mx-2" to={`/train/update/${train.id}`}>Edit</Link>
                <button className="btn btn-danger mx-2" onClick={()=>deleteTrain(train.id)}>Delete</button>
            </td>
            </tr>

        ))
    }
    
    
  </tbody>
</table>
        </div>
    </div>
  )
}
