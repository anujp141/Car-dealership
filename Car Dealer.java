import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarDealerProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Part 1: Read 5 numbers and store them in an ArrayList
        ArrayList<Double> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            double num = scanner.nextDouble();
            numbers.add(num);
        }
        
        // Calculate sum, product, largest, and smallest
        double sum = 0;
        double product = 1;
        double largest = Double.MIN_VALUE;
        double smallest = Double.MAX_VALUE;
        
        for (double num : numbers) {
            sum += num;
            product *= num;
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
        
        // Part 2: Create a HashMap of vehicles
        HashMap<String, String> vehicleMap = new HashMap<>();
        vehicleMap.put("Civic", "Honda");
        vehicleMap.put("Accord", "Honda");
        vehicleMap.put("Camry", "Toyota");
        vehicleMap.put("Corolla", "Toyota");
        vehicleMap.put("Mustang", "Ford");
        vehicleMap.put("F-150", "Ford");
        
        // Ask the customer for a car model
        System.out.print("What car model are you looking for? ");
        String carModel = scanner.next();
        
        // Check if the car model exists in the HashMap
        if (vehicleMap.containsKey(carModel)) {
            String make = vehicleMap.get(carModel);
            System.out.println("Oh, you're looking for a " + carModel + "? Our " + make + " selection is right over here...");
        } else {
            System.out.println("Sorry, we don't have that car model in our inventory.");
        }
        
        scanner.close();
    }
}
