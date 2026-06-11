abstract class Payment {
    String transactionId;
    double amount;

    Payment(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    abstract void processPayment();
}

class CreditCardPayment extends Payment {

    CreditCardPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }

    void processPayment() {
        double total = amount + amount * 0.02;
        System.out.println("Credit Card Payment");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: " + total);
    }
}

class PayPalPayment extends Payment {

    PayPalPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }

    void processPayment() {
        double total = amount + amount * 0.03;
        System.out.println("PayPal Payment");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: " + total);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment("TXN101", 1000);
        Payment p2 = new PayPalPayment("TXN102", 1000);

        p1.processPayment();
        p2.processPayment();
    }
}