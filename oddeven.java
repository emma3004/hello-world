//program to find odd or even
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = input.nextInt();
		if (num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("odd");
		}


	}
