import React, { useState, useEffect } from 'react';
import { Link } from 'react-router-dom';

const StudentList = () => {
    const [students, setStudents] = useState([]);

    useEffect(() => {
        fetch('http://localhost:8082/api/v1/student/getAllStudents')
            .then((response) => response.json())
            .then((data) => setStudents(data))
            .catch((err) => console.error('Error fetching students:', err));
    }, []);

    const deleteStudent = (id) => {
        fetch(`http://localhost:8082/api/v1/student/delete/${id}`, {
            method: 'DELETE',
        })
            .then(() => {
                setStudents(students.filter((student) => student.studentid !== id));
            })
            .catch((err) => console.error('Error deleting student:', err));
    };

    return (
        <div>
            <h2>Student List</h2>
            <table>
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Phone</th>
                    <th>Address</th>
                    <th>Actions</th>
                </tr>
                </thead>
                <tbody>
                {students.map((student) => (
                    <tr key={student.studentid}>
                        <td>{student.studentid}</td>
                        <td>{student.studentname}</td>
                        <td>{student.phone}</td>
                        <td>{student.address}</td>
                        <td>
                            <Link to={`/update/${student.studentid}`} className="update">
                                Update
                            </Link>
                            <span
                                onClick={() => deleteStudent(student.studentid)}
                                className="delete"
                                style={{ cursor: 'pointer', marginLeft: '10px' }}
                            >
                  Delete
                </span>
                        </td>
                    </tr>
                ))}
                </tbody>
            </table>
        </div>
    );
};

export default StudentList;
