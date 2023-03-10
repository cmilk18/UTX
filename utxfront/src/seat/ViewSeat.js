import axios from 'axios';
import React, { useEffect,useState } from 'react'
import { Link, useParams } from 'react-router-dom'

export default function ViewSeat() {

    const [seat,setSeat]=useState({
        trainNumber:"",
        trainId:"",
        level:"",
        seatNumber:""
       
    })

    const {id}=useParams();

    useEffect(()=>{
        loadSeat();
        // eslint-disable-next-line react-hooks/exhaustive-deps
    },[]);

    const loadSeat = async()=>{
        const result = await axios.get(`http://localhost:8080/seat/read/${id}`);
        setSeat(result.data)
    }

  return (
    <div className="container">
        <div className="row">
            <div className='col-md-6 offset-md-3 border rounded p-4 mt-2 shadow'>
                <h2 className="text-center m-4">Seat Details</h2>
                        
                <div className="card">
                    <div className='card-header'>
                        Details of Train id : {seat.id}
                        <ul className='list-group list-group-flush'>
                            <li className='list-group-item'>
                                <b>Level :</b>
                                {seat.level}
                                </li>
                                <li className='list-group-item'>
                                <b>좌석번호 : </b>
                                {seat.seatNumber}

                                </li>
                                <li className='list-group-item'>
                                <b>열차번호 : </b>
                                {seat.train.id}
                                </li>
                                <li className='list-group-item'>
                                <b>호차번호 : </b>
                                {seat.trainNumber}
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
