package src.model;

public class Professor extends User{
    public Professor(String Name, String Password, String Address){
        super(Name, Password, Address);
    }

    private Student[] listStudents(){
        Student students[] = new Student[1];

        return students;
    }
}