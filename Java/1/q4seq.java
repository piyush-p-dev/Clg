public class q4seq {

    public static void main(String[] args) {

        int a, b, c;
        a = 0;
        b = 1;
        int d = 2;
        for (int i = 0; i < 8; i++) {
            c = a + b;
            System.out.print(a + " ");
            System.out.print(d + " ");
            d *= 2;
            a = b;
            b = c;

        }
    }
}
