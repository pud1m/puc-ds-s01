package src.model;

import java.io.Serializable;

public class Course implements Serializable {
    public Course(){}

    private String Name;
    private int credits;
    private Discipline disciplines[];
    private static final long serialVersionUID = 1L;

    public String[] getCurriculum(){
        String curriculum[] = new String[1];

        return curriculum;
    }
}