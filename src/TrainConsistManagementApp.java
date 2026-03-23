import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("==========================================\n");

        // UC4: Maintain Ordered Bogie Consist (LinkedList)
        System.out.println("==========================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("==========================================\n");

        // LinkedList allows us to use addFirst, addLast, etc.
        LinkedList<String> trainConsist = new LinkedList<>();

        // 1. Initial Setup
        System.out.println("Enter 5 initial bogies (Recommended: Engine, Sleeper, AC, Cargo, Guard):");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Bogie " + i + ": ");
            trainConsist.add(scanner.nextLine());
        }

        System.out.println("\nInitial Train Consist:");
        System.out.println(trainConsist);

        // 2. Positional Insertion
        System.out.print("\nEnter a special bogie to insert at position 2 (e.g., Pantry Car): ");
        String specialBogie = scanner.nextLine();
        trainConsist.add(2, specialBogie);

        System.out.println("After Inserting '" + specialBogie + "' at position 2:");
        System.out.println(trainConsist);

        // 3. Removing First and Last
        System.out.println("\nDetaching the first and last bogies for maintenance...");
        if (!trainConsist.isEmpty()) {
            String first = trainConsist.removeFirst();
            System.out.println("Removed First: " + first);
        }
        if (!trainConsist.isEmpty()) {
            String last = trainConsist.removeLast();
            System.out.println("Removed Last: " + last);
        }

        // Final State
        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(trainConsist);

        System.out.println("\nUC4 ordered consist operations completed...");
        scanner.close();
    }
}