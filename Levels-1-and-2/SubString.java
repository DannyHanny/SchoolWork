package helloworld;

public class SubString {
	public static void main(String[] args){
		String Horse = "You can lead a horse to water, but you can’t force it to drink";
		int length = Horse.length();
		System.out.print(new StringBuilder(Horse).reverse().toString()); 
		
		System.out.print(Horse);
		System.out.print(" "+ length);
		
	}
}
