package helloworld;

import java.util.Scanner;

public class FullName {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Type in your full name: ");
		String str = input.nextLine();
		System.out.print("Hello " + str.substring(str.indexOf(" ")+1, str.length()));
}
}