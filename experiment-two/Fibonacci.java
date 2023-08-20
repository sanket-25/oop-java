import java.util.Scanner;

class Fibonacci {
	public static void main(String args[]) {
		Scanner scanf = new Scanner(System.in);
		int a = scanf.nextInt();

		int t1=0;
		int t2=1;

		for(int i=1; i<=a; i++){
		    System.out.println(t1);
			int sum = t1+t2;
			t1=t2;
			t2=sum;
		}
	}
}