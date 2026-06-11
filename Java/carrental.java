import java.util.Scanner;

class Car {
    // int registration = 242;
    // String brand = "Tata";
    // int rent = 1000;
    // boolean availability = true;

    int registration;
    String brand;
    int rent;
    boolean availability;

    public Car(int registration, String brand, int rent, boolean availability) {
        this.registration = registration;
        this.brand = brand;
        this.rent = rent;
        this.availability = availability;
    }

    void display() {
        System.out.println("Registration: " + registration);
        System.out.println("Brand: " + brand);
        System.out.println("rent Perday: " + rent);

    }
}

public class carrental {

    public static void main(String[] args) {
        Car obj = new Car(245, "Tata", 1000, true);
        Scanner sc = new Scanner(System.in);
        System.out.print("No of Days: ");
        int NoofDays = sc.nextInt();
        System.out.print("Total Rent: ");
        System.out.println(NoofDays * obj.rent);
        System.out.print("Do you want to return(1) or rent(0) ");
        int availVec = sc.nextInt();
        if (availVec == 1 || availVec == 2) {
            if (availVec == 1) {
                obj.availability = true;
                System.out.println("Car has been returned");
                obj.display();
            } else {
                obj.availability = false;
                System.out.println("Car has been rented");
                obj.display();

            }

        } else {
            System.out.println("Please Enter valid value");
        }
        sc.close();
    }
}
