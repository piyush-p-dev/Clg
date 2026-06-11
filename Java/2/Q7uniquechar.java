import java.util.Scanner;

class Unique {

    boolean check(String str) {

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j))
                    return false;
            }
        }

        return true;
    }
}

public class Q7uniquechar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        Unique obj = new Unique();

        if (obj.check(str))
            System.out.println("All characters are unique");
        else
            System.out.println("Duplicate characters found");
        sc.close();
    }
}