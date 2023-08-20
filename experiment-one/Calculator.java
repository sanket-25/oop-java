import java.util.Scanner;

class Calculator {
	public static void main(String args[]) {
	    Scanner scanf = new Scanner(System.in);

		System.out.print("Enter num1: ");
		double a = scanf.nextDouble();
		System.out.print("Enter num2: ");
		double b = scanf.nextDouble();
		System.out.print("Choose the operator -> +,-,*,/,%: ");
		char o = scanf.next().charAt(0);

		switch(o){
		case '+':
			System.out.println(a+b);
			break;
	
		case '-':
			System.out.println(a-b);
			break;

		case '*':
			System.out.println(a*b);
			break;

		case '/':
			System.out.println(a/b);
			break;

		case '%':
			System.out.println(a%b);
			break;

		default:
			System.out.println("Please choose appropriate operator");
			break;

    	}
	    
	}
}