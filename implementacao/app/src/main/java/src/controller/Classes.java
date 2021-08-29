package src.controller;

import src.model.Discipline;
import src.model.Professor;

public class Classes extends Discipline{
    public Classes(String Name, int semester, int credits, boolean mandatory){
        super(Name, semester, credits, mandatory);
    }

    private int totalStudents;
    private int semester;
    private boolean active;
    private Professor professor;
    
    public Professor getProfessor(){
        return professor;
    }

    public void setProfessor(Professor professor){
        this.professor = professor;
    }

    @Override
    public String toString(){
        return this.getName();
    }
}