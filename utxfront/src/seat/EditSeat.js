
import axios from 'axios'
import React, {  useEffect, useState } from 'react'
import { Link, useNavigate, useParams } from 'react-router-dom'

export default function EditSeat() {

    let navigate=useNavigate()

    const {id} = useParams()

    const [seat,setseat]=useState({
        trainNumber:"",
        trainid:"",
        level:"",
        seatNumber:""
        
    })

    const{trainNumber,trainId,level,seatNumber}=seat

    const onInputChange=(e)=>{
        setseat({...seat,[e.target.name]:e.target.value})
    };

    useEffect(()=>{
        loadSeat();
        // eslint-disable-next-line react-hooks/exhaustive-deps
    },[]);

    const onSubmit=async (e)=>{
        e.preventDefault();
        await axios.put(`http://localhost:8080/seat/update/${id}`,seat)
        navigate("/seat")

    };

    const loadSeat = async()=>{
        const result = await axios.get(`http://localhost:8080/seat/read/${id}`)
        setseat(result.data)
    }


  return <div className="container">
        <div className="row">
            <div className='col-md-6 offset-md-3 border rounded p-4 mt-2 shadow'>
                <h2 className="text-center m-4">Edit Seat</h2>

                <form onSubmit={(e)=>onSubmit(e)}>
                <div className="mb-3">
                    <label htmlFor="Level" className="form-label">
                        좌석등급
                    </label>
                    <input
                     type={"text"}
                     className="form-control"
                     placeholder="Enter your Level"
                     name="level"
                     value={level}
                     onChange={(e)=>onInputChange(e)}
                     />
                </div>

   

                <div className="mb-3">
                    <label htmlFor="seatNumber" className="form-label">
                        좌석번호
                    </label>
                    <input
                     type={"text"}
                     className="form-control"
                     placeholder="Enter your SeatNumber"
                     name="seatNumber"
                     value={seatNumber}
                     onChange={(e)=>onInputChange(e)}
                     />
                </div>

                <div className="mb-3">
                    <label htmlFor="trainId" className="form-label">
                        열차번호
                    </label>
                    <input
                     type={"text"}
                     className="form-control"
                     placeholder="Enter your trainId"
                     name="trainId"
                     value={trainId}
                     onChange={(e)=>onInputChange(e)}
                     />
                </div>

                <div className="mb-3">
                    <label htmlFor="text" className="form-label">
                        호차번호
                    </label>
                    <input
                     type={"text"}
                     className="form-control"
                     placeholder="Enter your trainNumber"
                     name="trainNumber"
                     value={trainNumber}
                     onChange={(e)=>onInputChange(e)}
                     />
                </div>
                
                <button type="submit" className="btn btn-outline-primary">SUBMIT</button>
                <Link type="submit" className="btn btn-outline-danger mx-2" to="/seat">CANCEL</Link>
                </form>
            </div>
        </div>
    
    </div>
}
