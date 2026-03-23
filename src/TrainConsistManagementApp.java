import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("==========================================\n");

        // UC6: Map Bogie to Capacity (HashMap)
        System.out.println("==========================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap) ");
        System.out.println("==========================================\n");

        // HashMap stores data in key -> value format
        Map<String, Integer> capacityMap = new HashMap<>();

        System.out.println("Enter the number of bogies you want to map:");
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter Bogie Name (Key) " + i + ": ");
            String bogieName = scanner.nextLine();

            System.out.print("Enter Capacity (Value) for " + bogieName + ": ");
            int capacity = Integer.parseInt(scanner.nextLine());

            // put() Method inserts the key-value pair
            capacityMap.put(bogieName, capacity);
        }

        System.out.println("\nBogie Capacity Details:");
        // entrySet() allows us to iterate through both keys and values
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 bogie-capacity mapping completed...");
        scanner.close();
    }
}