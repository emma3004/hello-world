import java.util.Scanner;
public class armstrong {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter hundreds digit:");
        int hu = input.nextInt();
        System.out.println("Enter tens digit:");
        int te = input.nextInt();
        System.out.println("Enter units digit:");
        int un = input.nextInt();
        String anum = (hu+""+te+""+un);
        int anum1 = Integer.parseInt(anum);
        //System.out.println(anum);
        double chu = Math.pow(hu,3);
        double cte = Math.pow(te,3);
        double cun = Math.pow(un,3);
        double sanum= chu + cte + cun;
        if (anum1==sanum) {
            System.out.println("Armstrong number");

        }
        else {
            System.out.println("Not a Armstrong number");
        }

