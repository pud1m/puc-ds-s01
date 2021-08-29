package src.model;

import src.controller.Classes;

public class Discipline{
    public Discipline(){}

    private Classes group;
    private Professor professor;
    private int semester;
    private int credits;
    private boolean mandatory;

    public void createClass(String group){

    }

    public int getSemester(){
        return semester;
    }

    public void setSemester(int semester){
        this.semester = semester;
    }

    public int getCredist(){
        return credits;
    }

    public void setCredits(int credits){
        this.credits = credits;
    }

    public boolean getMandatory(){
        return mandatory;
    }

    public void setMandatory(boolean mandatory){
        this.mandatory = mandatory;
    }

    public Classes getClassess(){
        return this.group;
    }

    public void setClasses(Classes group){
        this.group = group;
    }

    public Professor getProfessor(){
        return professor;
    }

    public void setProfessor(Professor professor){
        this.professor = professor;
    }
}