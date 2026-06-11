import java.util.Scanner;

public class q11power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();
        int exp = sc.nextInt();

        long result = 1;

        for (int i = 1; i <= exp; i++)
            result *= base;

        System.out.println(result);
        sc.close();
    }
}
