import java.util.Scanner;

class roots {
    public static void main(String args[]){
        System.out.println("let the equation be of form -> ax^2+bx+c");
        
        Scanner scanf = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanf.nextInt();
        System.out.print("Enter b: ");
        double b = scanf.nextInt();
        System.out.print("Enter c: ");
        double c = scanf.nextInt();
        
        double D = b*b-4*a*c;
        double Droot = Math.sqrt(D);
        if(D>0){
            System.out.println("Roots are real and distinct and are: ");
            System.out.println((-b+Droot)/(2*a));
            System.out.println((-b+Droot)/(2*a));
        }
        else if(D==0){
            System.out.println("Roots are real and equal and is: ");
            System.out.println(-b/(2*a));
        }
        else{
            double iDroot = Math.sqrt(D/(4*a*a));
            System.out.println("Roots are complex and distinct and are: ");
            System.out.println(-b/(2*a)+"+i"+iDroot);
            System.out.println(-b/(2*a)+"-i"+iDroot);
        }
        
    }
}