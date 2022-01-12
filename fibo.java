
import java.util.Scanner;
public class fibo {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int n = input.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.println(n1+"\n"+n2);
        for (int count = 3; count <= n; count++) {
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
        }
    }
}                
