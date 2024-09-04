package modelos;

/**
 * @author kendr
 * @version 1.0
 * @created 03-sep.-2024 17:52:45
 */

public class Student {

	private float average;
	private String career;
	private String cif;
	private String firstName;
	private String lastName;
	private boolean scholarship;

	public Student(){

	}

	public Student(float average, String career, String cif, String firstName, String lastName) {
		this.average = average;
		this.career = career;
		this.cif = cif;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public float getAverage() {
		return average;
	}

	public void setAverage(float average) {
		this.average = average;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isScholarship() {
		return scholarship;
	}

	public void setScholarship(boolean scholarship) {
		this.scholarship = scholarship;
	}

	@Override
	public String toString() {
		return "Student{" +
				"average=" + average +
				", career='" + career + '\'' +
				", cif='" + cif + '\'' +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", scholarship=" + scholarship +
				'}';
	}
}//end Student