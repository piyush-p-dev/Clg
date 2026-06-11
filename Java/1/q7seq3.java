public class q7seq3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            System.out.print(2 * i + " ");

            int fact = 1;
            for (int j = 1; j <= i; j++)
                fact *= j;

            System.out.print(fact + " ");
        }
    }
}
