import java.util.Scanner;

class Domain {

    String getDomain(String url) {

        url = url.replace("https://", "");
        url = url.replace("http://", "");
        url = url.replace("www.", "");

        int slash = url.indexOf('/');

        if (slash != -1)
            url = url.substring(0, slash);

        return url;
    }
}

public class Q10extractdomain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String url = sc.nextLine();

        Domain obj = new Domain();

        System.out.println("Domain: " + obj.getDomain(url));
        sc.close();
    }
}