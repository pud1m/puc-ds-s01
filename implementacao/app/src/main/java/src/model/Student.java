package src.model;

import java.util.Scanner;
import java.io.Serializable;
import src.controller.Classes;

public class Student extends User implements Serializable {

    public Student(String Name, String Password, String Address){
        super(Name, Password, Address);
        groups = new Classes[10];
    }

    private int ID;
    public Classes groups[];
    public Course course;
    private static final long serialVersionUID = 1L;

    public void createRegistrations(){
        try {
            Scanner readInput = new Scanner(System.in);
            String Discipline;

            Discipline = readInput.nextLine();
            Classes tmpClass = new Classes(Discipline, 1,10, true);
            groups[0] = tmpClass;
            
            System.out.println("TES");
            readInput.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    public void cancelRegistrations(String Discipline){
        //
    }


    public void getGroups(){
        System.out.println(groups[0].toString());
    }
} 