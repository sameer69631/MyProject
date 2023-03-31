import java.util.Scanner;

interface LaunchInterface{
	public void launchApp();
	public void runApp();
}

public class Launch implements LaunchInterface {
	Scanner sc = new Scanner(System.in);
	
	Print print = new Print();
	TakeInput takeInput = new TakeInput();
	HospitalProperties hospitalP = new HospitalProperties();
	
	int selectedOption;
	
	public void launchApp() {
		try {
		
		print.printIntro();
		String userName1 = takeInput.nameInput();
		int password1 = takeInput.passwordInput();
		
		if(userName1.equals(takeInput.userNameStored) && password1 == takeInput.passwordStored) {
			print.printOptions();
			selectedOption = takeInput.optionInput();
			runApp();
		}
		else {
			System.out.println();
			System.out.println("invalid username or password");
			System.out.println("try again or call our tollfree helpline number - 123456789");
		}
		
		}
		catch (Exception e) {
			System.out.println("something went wrong....");
		}
	}
	
	
	public void runApp() {
		
		if(selectedOption == 1) {
			hospitalP.appointment();
			starAppAgain();
		}
		else if(selectedOption == 2) {
			hospitalP.laboratory();
			starAppAgain();
		}
		else if (selectedOption == 3) {
			hospitalP.medcal();
			starAppAgain();
		}
		else {
			System.out.println("invalid number");
			System.out.println("-*-*=*-*=*-*-*=*-*=*-*-*=*-*=*-*-*=*-*=*-*-*=*-*=*");
			starAppAgain();
		}
	}
	
	public void starAppAgain() {
		System.out.println();
		System.out.println("enter any number to start app again");
		int number = sc.nextInt();
		if(number >=0 || number <=0) {
			launchApp();
		}
	}

	
}
