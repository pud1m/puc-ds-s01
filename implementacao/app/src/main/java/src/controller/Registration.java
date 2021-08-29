package src.controller;

import src.model.Student;

public class Registration{
    public Registration(){}

    private Student student;
    private Classes group;

    public void setStudent(Student student){
        this.student = student;
    }

    public void setClasses(Classes group){
        this.group = group;
    }
}