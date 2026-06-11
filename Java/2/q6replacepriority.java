import java.util.Scanner;

class Filter {

    String clean(String text) {

        String[] bad = {
                "bad",
                "ugly",
                "stupid"
        };

        for (String word : bad)
            text = text.replace(word, "***");

        return text;
    }
}

public class q6replacepriority {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        Filter obj = new Filter();

        System.out.println(obj.clean(text));
        sc.close();
    }
}