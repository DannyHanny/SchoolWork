package helloworld;

import java.util.Scanner;
public class postcode {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Type in your postcode: ");
		String str = input.nextLine();
		System.out.print(str.toUpperCase());

}
}