import java.util.Scanner;

class PasswordCheck {

    int checkPassword(String str) {

        if (str.length() < 4)
            return 0;

        if (Character.isDigit(str.charAt(0)))
            return 0;

        boolean digit = false;
        boolean capital = false;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == ' ' || ch == '/')
                return 0;

            if (Character.isDigit(ch))
                digit = true;

            if (Character.isUpperCase(ch))
                capital = true;
        }

        return (digit && capital) ? 1 : 0;
    }
}

public class q2passwordchecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        PasswordCheck obj = new PasswordCheck();

        System.out.println(obj.checkPassword(str));
        sc.close();
    }
}