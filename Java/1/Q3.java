public class Q3 {

    static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {

        int a = 0, b = 1, count = 0;

        while (count < 8) {
            if (isPrime(a)) {
                System.out.print(a + " ");
                count++;
            }

            int c = a + b;
            a = b;
            b = c;
        }
    }
}