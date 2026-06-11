import java.util.Arrays;
import java.util.Scanner;

class Anagram {

    boolean check(String s, String t) {

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}

public class q5anagramcheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        Anagram obj = new Anagram();

        System.out.println(obj.check(s, t));
        sc.close();
    }
}