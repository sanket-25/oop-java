import java.util.Scanner;

class Prime {
	public static void main(String args[]){
		System.out.print("Enter the number please: ");
		Scanner scanf = new Scanner(System.in);
		int a = scanf.nextInt();

		int flag = 0;
		for(int i=2; i<=a/2; i++){
			if(a%i==0){
				flag=1;
				break;
			}

		}

		if(flag==0){
			System.out.println("I'm a Prime");
		}
		else{
			System.out.println("I'm not a Prime");
		}


	}
}