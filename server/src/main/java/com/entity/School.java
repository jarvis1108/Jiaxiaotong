package com.entity;


import javax.persistence.*;


@Entity
@Table(name="school")
public class School {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String schoolID;
    private String schoolName;

    public School(){};

    public School(String schoolID){
        this.schoolID=schoolID;
        this.schoolName=schoolName;
    }

    public School(String schoolID, String schoolName ){
        this.schoolID=schoolID;
        this.schoolName=schoolName;
    }

    public String getschoolID() {
        return schoolID;
    }
    public void setschoolID(String schoolID) {
        this.schoolID = schoolID;
    }

    public String getschoolName() {
        return schoolName;
    }
    public void setschoolName(String schoolName) {
        this.schoolName = schoolName;
    }

}
