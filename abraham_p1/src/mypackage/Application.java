package mypackage;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int choice,i=0;
while(i<5) {
		System.out.println("Welcome to the NoodleTech spy soft ware. This program is designed to encrypt and decrypt a set of numbers.\nHere are your options:\n1.Encryption\n2.Decryption");
		Scanner input = new Scanner(System.in);
		choice=input.nextInt();//User inputs the number they want encrypted
		switch(choice) {
		case 1:
			Encrypter encryptnum = new Encrypter();
			encryptnum.encrypt();//Encryption method
			break;
		case 2:
			Decrypter decryptnum = new Decrypter();//Decryption Method
			decryptnum.decrypt();
			break;
			default:
				System.out.println("This is an invalid selection.");
				break;
		}
}
	}

}
