package ucuncuDersOdev;

public class UserManager {
	
	
	public void signUp(User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kay�t oldu.");
	}
	
	public void verification(User user) {
		
		
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Kodlama.io ' ya ho�geldiniz.");
		
	}
	
	public void signOut(User user) {
		
		System.out.println("��k�� Yap�ld�.");
	}
	
	public void showUserInfo(User user) {
		
		//
	}
	
	
	
	
	
	
}
