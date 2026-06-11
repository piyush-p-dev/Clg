class Product {
    String productName;
    double price;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
}

class Electronics extends Product {
    String warrantyPeriod;

    Electronics(String productName, double price,
            String warrantyPeriod) {
        super(productName, price);
        this.warrantyPeriod = warrantyPeriod;
    }
}

class Smartphone extends Electronics {
    String batteryLife;

    Smartphone(String productName, double price,
            String warrantyPeriod, String batteryLife) {
        super(productName, price, warrantyPeriod);
        this.batteryLife = batteryLife;
    }

    void displayDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Warranty: " + warrantyPeriod);
        System.out.println("Battery Life: " + batteryLife);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone("iPhone 14", 999,
                "1 Year", "20 Hours");

        phone.displayDetails();
    }
}