public class q15randomno {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            int num = (int) (Math.random() * 100) + 1;
            System.out.println(num);
        }
    }
}
