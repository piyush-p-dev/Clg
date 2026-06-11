import java.util.Scanner;

class Permutation {

    void permute(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String rem = str.substring(0, i)
                    + str.substring(i + 1);

            permute(rem, ans + ch);
        }
    }
}

public class Q4stringpermu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        Permutation obj = new Permutation();

        obj.permute(str, "");
        sc.close();
    }
}