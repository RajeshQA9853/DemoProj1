import java.util.Scanner;

public class PalindrumNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check wheather it is a palindrum or not");
		int number = sc.nextInt();
		int reverse = 0;
		int org_number = number;
		
		while(number != 0) {
			reverse = reverse * 10 + number % 10;
			number = number / 10;
		}
		System.out.println(reverse);
		
		if(org_number == reverse) {
			System.out.println("Number is palindrum");
		}
		else {
			System.out.println("Number is not palindrum");
		}
		
	}

}
