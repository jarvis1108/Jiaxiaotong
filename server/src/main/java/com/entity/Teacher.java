package com.entity;


import javax.persistence.*;


@Entity
@Table(name="teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String teacherID;
    private String teacherName;
    private String schoolID;

    public Teacher(){};

    public Teacher(String teacherID){
        this.teacherID=teacherID;
        this.teacherName=teacherName;
    }

    public Teacher(String teacherID, String teacherName, String schoolID ){
        this.teacherID=teacherID;
        this.teacherName=teacherName;
        this.schoolID=schoolID;
    }

    public String getteacherID() {
        return teacherID;
    }
    public void setteacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getteacherName() { return teacherName; }
    public void setteacherName(String teacherName) { this.teacherName = teacherName; }

    public String getschoolID() {
        return schoolID;
    }
    public void setschoolID(String schoolID) {
        this.schoolID = schoolID;
    }
}
