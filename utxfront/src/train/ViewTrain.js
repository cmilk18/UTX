import axios from 'axios';
import React, { useEffect,useState } from 'react'
import { Link, useParams } from 'react-router-dom'

export default function ViewTrain() {

    const [train,setTrain]=useState({
        name:"",
       
    })

    const {id}=useParams();

    useEffect(()=>{
        loadTrain();
        // eslint-disable-next-line react-hooks/exhaustive-deps
    },[]);

    const loadTrain = async()=>{
        const result = await axios.get(`http://localhost:8080/train/${id}`);
        setTrain(result.data)
    }

  return (
    <div className="container">
        <div className="row">
            <div className='col-md-6 offset-md-3 border rounded p-4 mt-2 shadow'>
                <h2 className="text-center m-4">Train Details</h2>

                <div className="card">
                    <div className='card-header'>
                        Details of Train id : {train.id}
                        <ul className='list-group list-group-flush'>
                            <li className='list-group-item'>
                                <b>Name:</b>
                                {train.name}
                            </li>
                            
                        </ul>
                    </div>
                </div>
                <Link className="btn btn-primary my-2" to={"/train"}>Back to Train</Link>

            </div>
        </div>
    </div>
  )
}
