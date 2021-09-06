package src.model;

import java.io.Serializable;
import src.controller.Classes;

public class Student extends User implements Serializable {

	private int ID;

	private static final long serialVersionUID = 1L;

	public Classes[] groups;

	public Course course;

	public Student(String Name, String Password, String Address) {

	}

	public void createRegistrations() {

	}

	public void cancelRegistrations(String Discipline) {

	}

	public void getGroups() {

	}

}
