package hello;
import java.util.Scanner;
public class task6{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		
		System.out.println("Type the first number");
		int number1=Integer.parseInt(reader.nextLine());
		System.out.println("Type the second number");
		int number2=Integer.parseInt(reader.nextLine());
		
		if(number1>number2) {
			System.out.println("Greater number: "+number1);
		}
		else if(number1<number2) {
			System.out.println("Greater number: "+number2);
		}
		else {
			System.out.println("The numbers are eaqual!");
		}
	}

}
