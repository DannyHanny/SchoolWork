package helloworld;

import java.util.Scanner;

public class password {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String str = "";
		String str2 = "0";
		while(!str.equals(str2)) {
			System.out.print("Enter your password: ");
			str = input.nextLine();
			System.out.print("Enter your password again: ");
			str2 = input.nextLine();
		}
		System.out.print("Password Verified");

}
}