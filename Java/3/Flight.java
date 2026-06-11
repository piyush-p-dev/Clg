package travel.flights;

public class Flight {
    String flightNumber;
    String destination;
    double price;

    public Flight(String flightNumber,
            String destination,
            double price) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.price = price;
    }

    public String getDetails() {
        return flightNumber + " " +
                destination + " Rs." + price;
    }
}