import java.util.Scanner;

public class Calculator{

public static void main(String args[]){ 
	Scanner Calculator= new Scanner(System.in);
System.out.println("enter number one : ");
int num1 = Calculator.nextInt();
System.out.println("Enter number two : ");
int num2 = Calculator.nextInt();
int sum = num1 + num2;
int sub = num1 - num2;
int divide = num1 /num2;
int mul = num1*num2;
	System.out.println("calculator Menu : \n");

	System.out.println("1 for Add \n 2 for sub \n 3 for multiplication and \n 4 for divide ");
	int choice = Calculator.nextInt();



switch(choice)
{
case 1 :
System.out.println("Adding ...");
System.out.println("sum is : " + sum);
break;

case 2 :
System.out.println("Substracting ...");
System.out.println("sub is : " + sub);
break;

case 3 :
System.out.println("Multiplying ...");
System.out.println("Product is : " + mul);
break;

case 4 :
System.out.println("Dividing ...");
System.out.println("Division is : " + divide);
break;

default:
System.out.println("Wrong choice entered!");
}

	
}
}
