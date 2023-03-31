
interface PrintInterface{
	public void printIntro(); 
	public void printOptions();
	public void printOptionsAppointment();
	public void printOptionsLaboratory();
	public void printOptionsMedical();
	public void printOptionHome();
}

public class Print implements PrintInterface {
	
	public void printIntro() {
		System.out.println("            -----------------------------------------------------------------");
		System.out.println("            *~*~*~*~* WELCOME TO MD.SAMEER MULTISPECIALITY HOSPITAL *~*~*~*~*");
		System.out.println("            -----------------------------------------------------------------");
		System.out.println();
		System.out.println("                      Enter Your User Name And Password To Login");
		System.out.println();
		System.out.println("If You Don't Have Youser Name And Password Visit Our Hospital's Branch Near Your Location");
		System.out.println();
	}
	
	public void printOptions() {
		System.out.println("***********************************************************");
		System.out.println("Dear User We Are Available 24/7, Please Select Any Option");
		System.out.println();
		System.out.println("Enter 1 - For Appointment");
		System.out.println("--------------------------");
		System.out.println("Enter 2 - For Laboratory Services");
		System.out.println("-----------------------------------");
		System.out.println("Enter 3 - For Medical Store Service");
		System.out.println("------------------------------------");
	}
	
	public void printOptionsAppointment() {
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("*~*~*~*~* Appointment Service *~*~*~*~*");
		System.out.println("----------------------------------------");
		System.out.println("Enter the number for which doctor's appointment you want");
		System.out.println();
		System.out.println("Enter 1 - Surgeon");
		System.out.println("------------------");
		System.out.println("Enter 2 - Neurologist");
		System.out.println("----------------------");
		System.out.println("Enter 3 - Physician");
		System.out.println("--------------------");
		System.out.println("Enter 4 - Cardiologist");
		System.out.println("-----------------------");
	}
	
	public void printOptionsLaboratory() {
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("*~*~*~*~* Laboratory Service *~*~*~*~*");
		System.out.println("----------------------------------------");
		System.out.println("Enter the number for the service you want");
		System.out.println();
		System.out.println("Enter 1 - To check your medical report history");
		System.out.println("-----------------------------------------------");
		
	}
	
	public void printOptionsMedical() {
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("*~*~*~*~* Medical Store Service *~*~*~*~*");
		System.out.println("----------------------------------------");
		System.out.println("Enter the number for the service you want");
		System.out.println();
		System.out.println("Enter 1 - To order medicines online");
		System.out.println("------------------------------------");
		
	}
	
	public void printOptionHome() {
		System.out.println("Enter 0 - To go to home page");
	}
}
