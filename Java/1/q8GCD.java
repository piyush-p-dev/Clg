import java.util.Scanner;

public class q8GCD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        System.out.println("GCD = " + a);
        sc.close();
    }
}
