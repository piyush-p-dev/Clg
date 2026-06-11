import java.util.Scanner;

class LongestWord {

    String find(String sentence) {

        String[] words = sentence.split(" ");

        String longest = words[0];

        for (String w : words) {

            if (w.length() > longest.length())
                longest = w;
        }

        return longest;
    }
}

public class Q8longestword {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        LongestWord obj = new LongestWord();

        System.out.println(obj.find(sentence));
        sc.close();
    }
}