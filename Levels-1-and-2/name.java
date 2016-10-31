package helloworld;
import java.util.Scanner;

public class name {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Type in your name I guess: ");
		String str = input.nextLine();
		System.out.print(str.length());
		
	}

}
