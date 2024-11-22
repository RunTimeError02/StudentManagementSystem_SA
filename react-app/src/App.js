import logo from './logo.svg';
import './App.css';
// import StudentList from "./components/StudentList";
//
// function App() {
//   return (
//     <div className="App">
// <StudentList/>
//     </div>
//   );
// }
//
// export default App;
import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import StudentList from './components/StudentList';
import AddStudent from './components/AddStudent';
import UpdateStudent from './components/UpdateStudent';

function App() {
    return (
        <Router>
            <div>
                <h1>Student Management System</h1>
                <Routes>
                    <Route path="/" element={<StudentList />} />
                    <Route path="/add" element={<AddStudent />} />
                    <Route path="/update/:id" element={<UpdateStudent />} />
                </Routes>
            </div>
        </Router>
    );
}

export default App;
