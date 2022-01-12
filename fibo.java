import java.util.Scanner;
public class fibo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int term = input.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.println(n1+"\n"+n2);
        for(int count=3;count<=term;count++) {
            int n3 = n1 + n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
        }
    }
}
//kunalbro ans
import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }

        System.out.println(b);
    }
}