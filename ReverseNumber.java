import java.util.Scanner;

class ReverseNumber {

	public static void main(String args[]) {
		Scanner ReverseNumber = new Scanner(System.in);
		System.out.println("Enter any number to reverse : ");
		int num = ReverseNumber.nextInt();
		int reversed = 0;
		while(num!=0) {
			int digit = num%10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}
		System.out.println("The reversed number is : " + reversed);
	}
}
	