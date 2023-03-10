
import './App.css';
import "../node_modules/bootstrap/dist/css/bootstrap.min.css";
import Navbar from './layout/Navbar'
import TrainHome from './pages/TrainHome';
import {BrowserRouter as Router,Routes,Route} from "react-router-dom";
import AddTrain from './train/AddTrain';
import EditTrain from './train/EditTrain';
import ViewTrain from './train/ViewTrain';
import SeatHome from './pages/SeatHome';
import AddSeat from './seat/AddSeat';
import ViewSeat from './seat/ViewSeat';
import EditSeat from './seat/EditSeat';

function App() {
  return (
    <div className="App">
      <Router>
        <Navbar/>

        <Routes>
          <Route exact path="/train" element={<TrainHome/>}/>
          <Route exact path="/train/add" element={<AddTrain/>}/>
          <Route exact path="/train/update/:id" element={<EditTrain/>}/>
          <Route exact path="/train/:id" element={<ViewTrain/>}/>

          <Route exact path="/seat" element={<SeatHome/>}/> 
          <Route exact path="/seat/add" element={<AddSeat/>}/>
          <Route exact path="/seat/read/:id" element={<ViewSeat/>}/>
          <Route exact path="/seat/update/:id" element={<EditSeat/>}/> 
          
        </Routes>
        
        
      </Router>
    </div>
  );
}

export default App;
