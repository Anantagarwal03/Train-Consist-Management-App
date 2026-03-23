import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("==========================================\n");

        // UC5: Preserve Insertion Order of Bogies (LinkedHashSet)
        System.out.println("==========================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("==========================================\n");

        // LinkedHashSet: Maintains order AND ensures uniqueness
        Set<String> formation = new LinkedHashSet<>();

        System.out.println("Enter bogies to attach (e.g., Engine, Sleeper, Cargo, Guard).");
        System.out.println("Try entering 'Sleeper' twice to see the deduplication:\n");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Attach Bogie " + i + ": ");
            String bogie = scanner.nextLine();

            boolean isNew = formation.add(bogie);
            if (!isNew) {
                System.out.println("--> [System Alert]: " + bogie + " is already attached. Duplicate ignored.");
            }
        }

        System.out.println("\n------------------------------------------");
        System.out.println("Final Train Formation:");
        System.out.println(formation);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");
        System.out.println("------------------------------------------");

        System.out.println("\nUC5 formation setup completed...");
        scanner.close();
    }
}