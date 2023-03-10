import axios from 'axios';
import React, { useEffect,useState } from 'react'
import { Link} from 'react-router-dom'

export default function SeatHome() {

    const [trains,setSeats]= useState([])

    useEffect(()=>{
        loadSeats();
    },[]);

    const loadTrains=async()=>{
        const result = await axios.get("http://localhost:8080/readall")
        setSeats(result.data);
    };

    const deleteTrain=async(id)=>{
        await axios.delete(`http://localhost:8080/delete/${id}`);
        loadSeats()
    }

  return (
    <div className='container'>
        <div className='py-4'>
            <table className="table border shadow">
                <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Level</th>
                        <th scope="col">SeatNumber</th>
                        <th scope="col">TrainId</th>
                        <th scope="col">TrainNumber</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        trains.map((train,id)=>(
                            <tr>
                                <th scope="row" key={id}>{id+1}</th>
                                <td>{seat.seatNumber}</td>

                                <td>
                                    <Link className="btn btn-primary mx-2" to={`/seat/read/${seat.id}`}>View</Link>
                                    <Link className="btn btn-outline-primary mx-2" to={`/seat/update/${seat.id}`}>Edit</Link>
                                    <button className="btn btn-danger mx-2" onClick={()=>deleteSeat()}>Delete</button>
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
