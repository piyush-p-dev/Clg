import java.util.Scanner;

public class q6fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        // int n = sc.nextInt();
        int n = 5;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            if (i < n)
                System.out.print(i + " x" + " ");
            else
                System.out.print(i + " :" + " ");
        }
        System.out.println(fact);

        sc.close();
    }
}
