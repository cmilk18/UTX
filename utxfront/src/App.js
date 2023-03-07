
import './App.css';
import "../node_modules/bootstrap/dist/css/bootstrap.min.css";
import Navbar from './layout/Navbar'
import Home from './pages/Home';
import {BrowserRouter as Router,Routes,Route} from "react-router-dom";
import AddTrain from './train/AddTrain';
import EditTrain from './train/EditTrain';
import ViewTrain from './train/ViewTrain';

function App() {
  return (
    <div className="App">
      <Router>
        <Navbar/>

        <Routes>
          <Route exact path="/train" element={<Home/>}/>
          <Route exact path="/train/add" element={<AddTrain/>}/>
          <Route exact path="/train/update/:id" element={<EditTrain/>}/>
          <Route exact path="/train/:id" element={<ViewTrain/>}/>
          
        </Routes>
        
        
      </Router>
    </div>
  );
}

export default App;
