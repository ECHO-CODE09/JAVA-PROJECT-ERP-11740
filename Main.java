import java.util.Scanner;

class Vehicle {
    String vehicleNumber;
    String brand;
    double rentPerDay;
    Vehicle(String vehicleNumber, String brand, double rentPerDay) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.rentPerDay = rentPerDay;
    }
    double calculateRent(int days) {
        return rentPerDay * days;
    }
    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Rent per Day: " + rentPerDay);
    }
}
class Car extends Vehicle {
    Car(String vehicleNumber, String brand, double rentPerDay) {
        super(vehicleNumber, brand, rentPerDay);
    }

    @Override
    double calculateRent(int days) {
        return (rentPerDay * days) + 500;
    }
}

class Bike extends Vehicle {
    Bike(String vehicleNumber, String brand, double rentPerDay) {
        super(vehicleNumber, brand, rentPerDay);
    }

    @Override
    double calculateRent(int days) {
        return rentPerDay * days;
    }
}
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Vehicle Type:");
        System.out.println("1. Car");
        System.out.println("2. Bike");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Vehicle Number: ");
        String number = sc.nextLine();

        System.out.print("Enter Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter Rent per Day: ");
        double rent = sc.nextDouble();

        System.out.print("Enter Number of Days: ");
        int days = sc.nextInt();

        Vehicle v;

        if (choice == 1) {
            v = new Car(number, brand, rent);
        } else {
            v = new Bike(number, brand, rent);
        }

        System.out.println("\n--- Vehicle Details ---");
        v.displayDetails();

        double total = v.calculateRent(days);
        System.out.println("Total Rent: " + total);

        sc.close();
    }
}