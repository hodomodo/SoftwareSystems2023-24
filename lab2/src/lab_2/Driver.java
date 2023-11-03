package lab_2;
import java.util.Scanner;


public class Driver
{
	public static void main(String[] args)
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("Please enter a sentence:");
		String sentence = myObj.nextLine();
		
		System.out.println(countWords());
		System.out.println();
		System.out.println();
	}
}
