import java.util.Scanner;

interface TakeInputInterface{
	
	String userNameStored = "abc";
	int passwordStored = 123;
	public String nameInput();
	public int passwordInput();
	public int optionInput();
}

public class TakeInput implements TakeInputInterface {
	
	Scanner sc=new Scanner(System.in);
	
	public String nameInput() {
		System.out.print("Enter Your User Name :- ");
		String userName = sc.next();
		return userName;
	}
	
	public int passwordInput() {
		System.out.print("Enter Password :- ");
		int password = sc.nextInt();
		return password;
	}
	
	public int optionInput() {
		System.out.println();
		System.out.print("Enter your choice :- ");
		int selectedOption = sc.nextInt();
		return selectedOption;
	}

}
