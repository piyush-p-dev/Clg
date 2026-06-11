public class q5seq {
    public static void main(String[] args) {
        // int n = 10;
        int a, b, c;
        a = 0;
        b = 1;
        int d = -1;
        for (int i = 0; i < 8; i++) {
            c = a + b;
            System.out.print(a + " ");
            System.out.print(d + " ");
            d -= 3;
            a = b;
            b = c;

        }
    }
}
