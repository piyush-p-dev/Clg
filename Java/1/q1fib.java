import java.util.Scanner;

public class q1fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int sum = 0;
        int a, b, c;
        a = 0;
        b = 1;
        for (int i = 0; i < 3; i++) {
            System.out.println(a);
            sum += a;
            c = a + b;
            a = b;
            b = c;

        }
        System.out.println(sum);

        sc.close();
    }
}
