import java.util.Scanner;

class TitleCase {

    String convert(String str) {

        String[] words = str.split(" ");

        String result = "";

        for (String w : words) {

            result += Character.toUpperCase(w.charAt(0))
                    + w.substring(1).toLowerCase()
                    + " ";
        }

        return result;
    }
}

public class Q9senToTitle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        TitleCase obj = new TitleCase();

        System.out.println(obj.convert(str));
        sc.close();
    }
}