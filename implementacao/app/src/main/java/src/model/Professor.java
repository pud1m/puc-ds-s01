package src.model;

import java.io.Serializable;

public class Professor extends User implements Serializable {

    private static final long serialVersionUID = 1L;

    public Professor(String Name, String Password, String Address){
        super(Name, Password, Address);
    }

    private Student[] listStudents(){
        Student students[] = new Student[1];

        return students;
    }

    public void createRegistrations(){}

    public void getGroups(){}
}