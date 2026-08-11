class Vehicle {
    String regNo;
    double dailyRate;

    // Constructor
    Vehicle(String regNo, double dailyRate) {
        this.regNo = regNo;
        this.dailyRate = dailyRate;
    }

    // Method to compute base rent
    double computeRent(int days) {
        return dailyRate * days;
    }
}

class Car extends Vehicle {
    int numDoors;

    // Constructor
    Car(String regNo, double dailyRate, int numDoors) {
        super(regNo, dailyRate);
        this.numDoors = numDoors;
    }

    // Method overriding
    @Override
    double computeRent(int days) {
        return super.computeRent(days) + 200;
    }
}

public class VehicleRental {
    public static void main(String[] args) {

        Car car = new Car("TN01AB1234", 1500, 4);

        System.out.println("Registration Number: " + car.regNo);
        System.out.println("Daily Rate: " + car.dailyRate);
        System.out.println("Number of Doors: " + car.numDoors);

        int days = 3;

        System.out.println("Number of Days: " + days);
        System.out.println("Total Rent: " + car.computeRent(days));
    }
}