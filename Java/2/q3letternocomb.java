import java.util.*;

class Phone {

    String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    void generate(String digits, int index, String current) {

        if (index == digits.length()) {
            System.out.println(current);
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (int i = 0; i < letters.length(); i++) {
            generate(digits, index + 1, current + letters.charAt(i));
        }
    }
}

public class q3letternocomb {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String digits = sc.nextLine();

        Phone obj = new Phone();

        if (!digits.isEmpty())
            obj.generate(digits, 0, "");
        sc.close();

    }
}