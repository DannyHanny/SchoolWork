package helloworld;

import java.util.Scanner;

public class FullFullName {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Type full full name: ");
		String str = input.nextLine();
		System.out.println(str.substring(0,1) + str.substring(str.indexOf(" ")+1,str.indexOf(" ")+2) + str.substring(str.indexOf(" ", str.indexOf(" ")+1)+1,str.indexOf(" ",str.indexOf(" ")+2)+2));

}
}