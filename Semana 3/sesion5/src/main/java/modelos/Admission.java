package modelos;


/**
 * @author kendr
 * @version 1.0
 * @created 03-sep.-2024 17:52:55
 */
public class Admission {

	public Admission(){

	}

	/**
	 * Calcula si el estudiante tiene derecho a beca
	 * @param student
	 */
	public void calcScholarship(Student student){
        student.setScholarship(student.getAverage() >= 80);
	}
}//end Admission