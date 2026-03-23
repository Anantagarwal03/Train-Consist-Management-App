import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("==========================================\n");

        // UC1 & UC2: List Management
        List<String> passengerBogies = new ArrayList<>();
        passengerBogies.add("Sleeper");
        passengerBogies.add("First Class");

        // UC3: Unique Bogie ID Tracking (HashSet)
        System.out.println("==========================================");
        System.out.println(" UC3 - Track Unique Bogie IDs (HashSet) ");
        System.out.println("==========================================\n");

        Set<String> bogieIds = new HashSet<>();

        System.out.println("Enter 4 Bogie IDs (Try entering a duplicate to test):");
        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter ID for Bogie " + i + ": ");
            String id = scanner.nextLine();

            // add() returns false if the element is already present
            boolean isAdded = bogieIds.add(id);
            if (!isAdded) {
                System.out.println("--> Alert: Duplicate ID '" + id + "' ignored by System!");
            }
        }

        System.out.println("\nFinal Unique Bogie IDs in System:");
        System.out.println(bogieIds);
        System.out.println("Total Unique Bogies Registered: " + bogieIds.size());

        System.out.println("\nUC3 operations completed successfully...");
        scanner.close();
    }
}