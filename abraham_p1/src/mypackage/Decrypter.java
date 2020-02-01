package mypackage;
import java.util.Scanner;

public class Decrypter {
	public void decrypt() {
		double dvalue,num5,num6,num7,num8,total1;
System.out.println("Please enter the four digit number you would like to decrypt.\n");
Scanner input2=new Scanner(System.in);
dvalue=input2.nextDouble();
num5=((Math.floor((dvalue%10000)/1000)+3)%10)*10;//the Math.floor((dvalue%1000)) type stuff is meant to identify and isolate the digits individually
num6=(Math.floor((dvalue%1000)/100)+3)%10;
num7=((Math.floor((dvalue%100)/10)+3)%10)*1000;
num8=((Math.floor((dvalue%10))+3)%10)*100;//I tried several iterations that didn't work, e.g -7 instead of +3,
total1=num5+num6+num7+num8;               // however negative values didn't gel really well with the rest of the program
System.out.println("Here is your decrypted number: "+String.format("%04.0f",total1));//It seems you have to specify to the computer no decimals or added width goes to decimal places instead of leading zeroes
}
}