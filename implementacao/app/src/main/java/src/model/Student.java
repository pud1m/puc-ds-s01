package src.model;

import src.controller.Registration;

public class Student extends User{
    public Student(String Name, String Password, String Address){
        super(Name, Password, Address);
    }

    private int ID;
    public Registration registrations[];
    public Course course;

    public void createRegistrations(){
        
    }

    public void cancelRegistrations(String Discipline){
        //
    }
} 