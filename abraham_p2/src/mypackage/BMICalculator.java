package mypackage;
import java.util.Scanner;


public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello!\nWelcome to the NoodleTech BMI calculator!\nThis program can do a few things, they are listed below.");
System.out.println("Select from the menu:\n1. Calculate BMI using Imperial Units(e.g, inches and pounds)\n2. Calculate BMI using Metric Units(e.g, meters and kilograms)\n3. Display the BMI categories and their values from the National Heart Lung and Blood Institute.");
Scanner input=new Scanner(System.in);//User chooses from the menu
int choice=input.nextInt();
switch(choice) {
case 1:
	//BMI using Imperial Units
	Scanner input1=new Scanner(System.in);
	System.out.println("Please enter your height in inches: ");
	double heighti=input1.nextDouble();
	
	
	System.out.println("Please enter your weight in pounds: ");
	double weighti=input1.nextDouble();
	
	BMICalculator calculation=new BMICalculator();//Supposed to actually do the arithmetic
	calculation.calculateBmiIm(heighti,weighti);
	
	//rip have to go back to Tampa can't finish the code
	
	break;
case 2:
	//BMI using Metric Units
	BMICalculator acquisition = new BMICalculator();
	acquisition.readMetricData();//This gets the data from the user
	
	break;
case 3:
	//BMI categories and whatnot
	BMICalculator bmicats=new BMICalculator();
	bmicats.bmiTable();
	break;
	default:
		System.out.println("That is an invalid selection, please try again...");
		break;
}
	
	
	}
	private void readMetricData() {
		Scanner input1=new Scanner(System.in);
		System.out.println("Please enter your height in meters: ");
		double heightm=input1.nextDouble();
		
		//This is to gather the info in metric hence 'weightm' meaning weight metric
		System.out.println("Please enter your weight in kilograms: ");
		double weightm=input1.nextDouble();
		
	}
	public void calculateBmiIm(double weighti,double heighti) {
		
		double numer,denom,bmi;//Stands for numerator and denominator of the BMI equation, I felt it easier to break it up this way
		numer=703*weighti;
		denom=heighti*heighti;
		bmi=numer/denom;
	}
	private void calculateBmiCategory() {
		
	}
	
public void readUserData() {
	
}
public void displayBmi() {
	
}
public double getWeighti() {
	//This is the method for retrieving user weight value. Also the i after the method name and variable name represent imperial.
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter your weight in pounds: ");
	double weighti=input.nextDouble();
	return weighti;
}
private void setWeight() {
	
}
public double getHeighti() {
	//Method to take user height input
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter your height in inches: ");
	double heighti=input.nextDouble();
	return heighti;
}
private void setHeight() {
	
}
public void getBmi() {
	
}
public void getBmiCategory() {
	
}
public void bmiTable() {
	System.out.println("Here is the list of BMI categories and what they mean:\nUnderweight=<18.5\nNormal Weight=18.5-24.9\nOverweight=25-29.9\nObesity>=30");
}






}
