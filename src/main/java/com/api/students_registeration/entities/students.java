package com.api.students_registeration.entities;

import javax.persistence.*;

@Entity
@Table(name="students")
public class students{

    // variables declaration
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="std_id")
    private int id;
    private String name;
    private String stream;
    private long mobileNo;
    private Float fees;

    // Constructors
    public students(int id, String name, String stream, long mobileNo, Float fees) {
        this.id = id;
        this.name = name;
        this.stream = stream;
        this.mobileNo = mobileNo;
        this.fees = fees;
    }
    public students() {
    }


    // getters and setters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getStream() {
        return stream;
    }
    public long getMobileNo() {
        return mobileNo;
    }
    public Float getFees() {
        return fees;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setStream(String stream) {
        this.stream = stream;
    }
    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }
    public void setFees(Float fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "students [id=" + id + ", name=" + name + ", stream=" + stream + ", mobileNo=" + mobileNo + ", fees="
                + fees + "]";
    }

}
