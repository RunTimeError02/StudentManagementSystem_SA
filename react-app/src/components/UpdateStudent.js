import React, { useState, useEffect } from 'react';
import { useParams, useNavigate } from 'react-router-dom';

const UpdateStudent = () => {
    const { id } = useParams();
    const navigate = useNavigate();
    const [student, setStudent] = useState({
        studentname: '',
        phone: '',
        address: '',
    });

    useEffect(() => {
        fetch(`http://localhost:8082/api/v1/student/update/${id}`)
            .then((response) => response.json())
            .then((data) => setStudent(data))
            .catch((err) => console.error('Error fetching student data:', err));
    }, [id]);

    const handleSubmit = (e) => {
        e.preventDefault();

        fetch(`http://localhost:8082/api/v1/student/update/${id}`, {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(student),
        })
            .then(() => {
                navigate('/');
            })
            .catch((err) => console.error('Error updating student:', err));
    };

    return (
        <div>
            <h2>Update Student</h2>
            <form onSubmit={handleSubmit}>
                <input
                    type="text"
                    placeholder="Name"
                    value={student.studentname}
                    onChange={(e) =>
                        setStudent({ ...student, studentname: e.target.value })
                    }
                />
                <input
                    type="text"
                    placeholder="Phone"
                    value={student.phone}
                    onChange={(e) => setStudent({ ...student, phone: e.target.value })}
                />
                <input
                    type="text"
                    placeholder="Address"
                    value={student.address}
                    onChange={(e) => setStudent({ ...student, address: e.target.value })}
                />
                <button type="submit">Update Student</button>
            </form>
        </div>
    );
};

export default UpdateStudent;
