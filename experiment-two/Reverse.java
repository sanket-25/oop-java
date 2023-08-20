import java.util.*;

class Reverse {
	public static void main(String args[]) {
	    System.out.print("Enter the number: ");
		Scanner scanf = new Scanner(System.in);
		String number = scanf.nextLine();

		char[] ch = new char[number.length()];
        for (int i = 0; i < number.length(); i++) {
            ch[i] = number.charAt(i);
        }

        for(int j=number.length(); j>0; j--){
        	System.out.print(ch[j]);
        }
	}
}