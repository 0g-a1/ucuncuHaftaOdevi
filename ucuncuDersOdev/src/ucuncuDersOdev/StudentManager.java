package ucuncuDersOdev;

public class StudentManager extends UserManager {

	public void studentLogIn(Student student) {
		
		System.out.println(student.getStudentId() + " id numaral� ��renci giri� yapt�.");
	}
	
	public void selectLecture(String dersSec) {
		
		System.out.println(dersSec + " dersi se�ildi.");
	}
	
	public void leftLecture() {
		
		System.out.println("Ders b�rak�ld�.");
	}
	
	
}
