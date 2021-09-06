package src.model;

import java.io.Serializable;

public class Discipline implements Serializable {

	private String Name;

	private int semester;

	private int credits;

	private boolean mandatory;

	private static final long serialVersionUID = 1L;

	public Discipline(String Name, int semester, int credits, boolean mandatory) {

	}

	public String getName() {
		return null;
	}

	public void setName(String Name) {

	}

	public int getSemester() {
		return 0;
	}

	public void setSemester(int semester) {

	}

	public int getCredits() {
		return 0;
	}

	public void setCredits(int credits) {

	}

	public boolean getMandatory() {
		return false;
	}

	public void setMandatory(boolean mandatory) {

	}

}
