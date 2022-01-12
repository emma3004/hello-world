import java.util.Scanner;
public class simplec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two values:");
         int a = input.nextInt();
         int b = input.nextInt();
        System.out.println("enter the operator:");
        char c = input.next().charAt(0);
        if (c=='+') {
            System.out.println("Sum=" + (a + b));
        }
        else if (c=='-') {
            System.out.println("difference=" + (a-b));
        }
        else if (c=='*') {
            System.out.println("product=" + (a * b));
        }
        else if (c=='/') {
            System.out.println("quotient=" + (a / b));
        }
        else {
            System.out.println("Enter valid operator");
        }

    }

}
