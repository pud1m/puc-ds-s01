package src.model;

import src.controller.Classes;

public class Discipline{
    public Discipline(String Name, int semester, int credits, boolean mandatory){
        setName(Name);
        setSemester(semester);
        setCredits(credits);
        setMandatory(mandatory);
    }

    private String Name;
    private int semester;
    private int credits;
    private boolean mandatory;

    public String getName(){
        return this.Name;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public int getSemester(){
        return semester;
    }

    public void setSemester(int semester){
        this.semester = semester;
    }

    public int getCredits(){
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
}