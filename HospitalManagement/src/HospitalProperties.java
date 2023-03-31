import java.util.ArrayList;
import java.util.Scanner;

interface HospitalProp{
	public void appointment();
	public void laboratory();
	public void medcal();
}

public class HospitalProperties implements HospitalProp {
	
	Scanner sc = new Scanner(System.in);
	
	Print print = new Print();
	TakeInput takeInput = new TakeInput();
	
	public void appointment() {
		print.printOptionsAppointment();
		int choice = takeInput.optionInput();
		if(choice==1 || choice==2 || choice==3 || choice==4) {
			System.out.println();
			System.out.println("Your appointment is fixed visit to hospital");
			System.out.println("       between 9:00 am to 5:00 pm");
			System.out.println();
			System.out.println("       Thank you have a great day");
		}
		else {
			System.out.println("invalid number");
		}
	}
	
	public void laboratory() {
		print.printOptionsLaboratory();
		int choice = takeInput.optionInput();
		if(choice==1) {
			System.out.println("It seems you did not done any lab tests your history is empty");
		}
		else {
			System.out.println("invalid number");
		}
	}
	
	public void medcal() {
		print.printOptionsMedical();
		int choice = takeInput.optionInput();
		if(choice==1) {
			System.out.println("           -*-  MEDICINE ONLINE ORDER  -*-");
			System.out.println("Enter your address without space");
			ArrayList aList=new ArrayList();
			aList.add(sc.next());
			System.out.println("Enter your phone number");
			int cell = sc.nextInt();
			System.out.println();
			System.out.println("Thank you we got your order updates will be given through messages");
		}
		else {
			System.out.println("invalid number");
		}
	}

}
