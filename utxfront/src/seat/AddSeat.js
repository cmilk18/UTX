
import axios from 'axios'
import React from 'react'
import { useNavigate } from 'react-router-dom'

export default function AddSeat() {

  let navigate=useNavigate()

  const [seat,setseat]=useState({
    trainNumber:"",
    trainId:"",
    level:"",
    seatNumber
  })

  const{trainNumber,trainId,level,seatNumber}=seat

  const onInputChange=(e)=>{
    setseat({...trainId,[e.target.name]:e.target.value})
  }

  const onSubmit=async(e)=>{
    e.preventDefault();
    await axios.post("http://localhost:8080/seat/create",seat)
    navigate("/seat")
  }

  return(
    <div className="container">
        <div className='row'>
            <div className='col-md-6 offset-md-3 border rounded p-4 mt-2 shadow'>
                <h2 className='text-center m-4'>Register Seat</h2>

                <form onSubmit={(e)=>onSubmit(e)}>
                    <div className='mb-3'>
                        <label htmlFor='Name' className='form-label'>
                            seatNumber
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
                    trainNumber,trainId,level,seatNumber
                    <div className='mb-3'>
                        <label htmlFor='Name' className='form-label'>
                            trainNumber
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
                    <div className='mb-3'>
                        <label htmlFor='Name' className='form-label'>
                            trainId
                        </label>
                        <input
                         type={"text"}
                         className="form-control"
                         placeholder="Enter your SeatNumber"
                         name="trainId"
                         value={trainId}
                         onChange={(e)=>onInputChange(e)}
                         />
                    </div>
                    <div className='mb-3'>
                        <label htmlFor='Name' className='form-label'>
                            level
                        </label>
                        <input
                         type={"text"}
                         className="form-control"
                         placeholder="Enter your SeatNumber"
                         name="level"
                         value={level}
                         onChange={(e)=>onInputChange(e)}
                         />
                    </div>
                </form>
            </div>
        </div>
    </div>
  )
  
  return (
    <div>AddSeat</div>
  )
}
