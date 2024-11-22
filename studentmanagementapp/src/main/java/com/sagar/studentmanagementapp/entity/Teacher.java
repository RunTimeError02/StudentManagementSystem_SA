package com.sagar.studentmanagementapp.entity;
import jakarta.persistence.*;
import java.util.Set;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

@Entity
@Table(name="techer")

public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="teacher_id",length = 11)
    private int teacherid;
    @Column(name="teacher_name",length = 45)
    private String teachername;
    @Column(name="address",length = 60)
    private String address;
    @Column(name="phone",length = 12)
    private String phone;
    public Teacher() {
    }
    public Teacher(int teacherid, String teachername, String address, String phone) {
        this.teacherid = teacherid;
        this.teachername = teachername;
        this.address = address;
        this.phone = phone;
    }
    public Teacher(String teachername, String address, String phone) {
        this.teachername = teachername;
        this.address = address;
        this.phone = phone;
    }
    public int getTeacherid() {
        return teacherid;
    }
    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }
    public String getTeachername() {
        return teachername;
    }
    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

}
