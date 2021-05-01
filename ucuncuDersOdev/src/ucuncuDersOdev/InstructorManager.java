package ucuncuDersOdev;

public class InstructorManager extends UserManager {
	
	@Override
	public void signUp(User user) {
		
		System.out.println("E�itmen kadrosuna " + user.getFirstName() + " " + user.getLastName() + " eklendi.");
	}
	
	public void instructorLogIn(Instructor instructor) {
		
		System.out.println(instructor.getInstructorId() + " id numaral� " + instructor.getFirstName() + " e�itmen giri� yapt�.");
	}
	
	public void addLecture(String dersEkle) {
		
		System.out.println(dersEkle + "Ders eklendi.");
	}
	
	public void updateLecture() {
		
		System.out.println("Ders g�ncellendi.");
	}

	public void deleteLecture() {
	
		System.out.println("Ders silindi.");
	}
	
	

}
