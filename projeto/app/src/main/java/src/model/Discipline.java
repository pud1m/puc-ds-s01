public class Discipline{
    public Discipline(){}

    private Classes class;
    private Professor professor;
    private int semester;
    private int credits;
    private boolean mandatory;

    public void createClass(String Class){

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

    public boolean setMandatory(boolean mandatory){
        this.mandatory = mandatory;
    }

    public int getClassess(){
        return class;
    }

    public void setClasses(Classes class){
        this.class = class;
    }

    public int getProfessor(){
        return professor;
    }

    public void setProfessor(Professor professor){
        this.professor = professor;
    }
}