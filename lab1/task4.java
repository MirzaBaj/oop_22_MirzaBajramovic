package hello;
import java.util.Scanner;
public class task4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		
		System.out.print("Type a number: ");
		int number1=Integer.parseInt(reader.nextLine());
		System.out.println("Type another number: ");
		
		int number2=Integer.parseInt(reader.nextLine());
		int sum=number1+number2;
		
		System.out.println("Sum of the numbers: "+sum);
	}

}
