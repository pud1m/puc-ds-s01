package src.model;

import java.io.Serializable;

public class Course implements Serializable {

	private String Name;

	private int credits;

	private static final long serialVersionUID = 1L;

	private Discipline[] disciplines;

	public Course() {

	}

	public String[] getCurriculum() {
		return null;
	}

}
