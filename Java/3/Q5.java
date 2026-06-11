interface UPIPayment {
    void payViaUPI(double amount);
}

interface CardPayment {
    void payViaCard(double amount);
}

class OnlinePayment implements UPIPayment, CardPayment {

    public void payViaUPI(double amount) {
        System.out.println("UPI Payment of Rs." +
                amount + " successful");
    }

    public void payViaCard(double amount) {
        System.out.println("Card Payment of Rs." +
                amount + " successful");
    }
}

public class Q5 {
    public static void main(String[] args) {

        OnlinePayment p = new OnlinePayment();

        p.payViaUPI(500);
        p.payViaCard(1000);
    }
}