import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("==========================================\n");

        List<String> trainConsist = new ArrayList<>();
        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count : " + trainConsist.size() + "\n");

        System.out.println("==========================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("==========================================\n");

        List<String> passengerBogies = new ArrayList<>();

        // USER INPUT: Adding Bogies
        System.out.println("Enter names of 3 passenger bogies to add:");
        for (int i = 1; i <= 3; i++) {
            System.out.print("Bogie " + i + ": ");
            String bogie = scanner.nextLine();
            passengerBogies.add(bogie);
        }

        System.out.println("\nAfter Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies + "\n");

        // USER INPUT: Removing a Bogie
        System.out.print("Enter the name of the bogie to remove: ");
        String toRemove = scanner.nextLine();

        if (passengerBogies.contains(toRemove)) {
            passengerBogies.remove(toRemove);
            System.out.println("After Removing '" + toRemove + "':");
            System.out.println("Passenger Bogies : " + passengerBogies + "\n");
        } else {
            System.out.println("Bogie '" + toRemove + "' not found in consist.\n");
        }

        // USER INPUT: Checking Existence
        System.out.print("Enter bogie name to check existence: ");
        String toCheck = scanner.nextLine();
        System.out.println("Contains " + toCheck + "? : " + passengerBogies.contains(toCheck) + "\n");

        System.out.println("Final Train Passenger Consist:");
        System.out.println(passengerBogies + "\n");

        System.out.println("UC2 operations completed successfully...");

        scanner.close();
    }
}