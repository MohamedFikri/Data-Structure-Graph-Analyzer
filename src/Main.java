import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayOperations arrayOperations = new ArrayOperations(10);

        int choice;

        do {
            System.out.println("\n=============================================");
            System.out.println(" DATA STRUCTURE & GRAPH ANALYZER");
            System.out.println("=============================================");
            System.out.println("1. Array Operations");
            System.out.println("2. Stack Operations");
            System.out.println("3. Queue Operations");
            System.out.println("4. Linked List Operations");
            System.out.println("5. Searching Operations");
            System.out.println("6. Graph Operations");
            System.out.println("7. Performance Comparison");
            System.out.println("8. Display All Results");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    arrayMenu(scanner, arrayOperations);
                    break;

                case 2:
                    System.out.println("Stack Operations - Coming Soon");
                    break;

                case 3:
                    System.out.println("Queue Operations - Coming Soon");
                    break;

                case 4:
                    System.out.println("Linked List Operations - Coming Soon");
                    break;

                case 5:
                    searchingMenu(scanner);
                    break;

                case 6:
                    System.out.println("Graph Operations - Coming Soon");
                    break;

                case 7:
                    PerformanceAnalyzer.compareSearchPerformance();
                    break;

                case 8:
                    System.out.println("Display All Results - Coming Soon");
                    break;

                case 9:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 9);

        scanner.close();
    }


    // =========================================
    // ARRAY OPERATIONS MENU
    // =========================================

    public static void arrayMenu(
            Scanner scanner,
            ArrayOperations arrayOperations) {

        int choice;

        do {
            System.out.println("\n---------- ARRAY OPERATIONS ----------");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Return to Main Menu");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value to insert: ");
                    int insertValue = scanner.nextInt();

                    arrayOperations.insert(insertValue);
                    break;


                case 2:
                    System.out.print("Enter value to delete: ");
                    int deleteValue = scanner.nextInt();

                    arrayOperations.delete(deleteValue);
                    break;


                case 3:
                    System.out.print("Enter value to search: ");
                    int searchValue = scanner.nextInt();

                    int index = arrayOperations.search(searchValue);

                    if (index != -1) {
                        System.out.println(
                                "Value found at index: " + index);
                    } else {
                        System.out.println("Value not found!");
                    }

                    break;


                case 4:
                    arrayOperations.display();
                    break;


                case 5:
                    System.out.println(
                            "Returning to Main Menu...");
                    break;


                default:
                    System.out.println(
                            "Invalid choice! Please try again.");
            }

        } while (choice != 5);
    }


    // =========================================
    // SEARCHING OPERATIONS MENU
    // =========================================

    public static void searchingMenu(Scanner scanner) {

        int[] numbers = {
                10, 25, 5, 40, 15, 30, 20, 50
        };

        int choice;

        do {
            System.out.println(
                    "\n---------- SEARCHING OPERATIONS ----------");

            System.out.println("Current Data:");
            System.out.println(
                    "10 25 5 40 15 30 20 50");

            System.out.println("\n1. Linear Search");
            System.out.println("2. Binary Search");
            System.out.println("3. Return to Main Menu");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();


            switch (choice) {

                // LINEAR SEARCH
                case 1:

                    System.out.print(
                            "Enter value to search: ");

                    int linearTarget = scanner.nextInt();

                    int linearResult =
                            SearchingOperations.linearSearch(
                                    numbers,
                                    linearTarget);

                    if (linearResult != -1) {

                        System.out.println(
                                "Value found using Linear Search.");

                        System.out.println(
                                "Index: " + linearResult);

                    } else {

                        System.out.println(
                                "Value not found using Linear Search.");
                    }

                    break;


                // BINARY SEARCH
                case 2:

                    System.out.print(
                            "Enter value to search: ");

                    int binaryTarget = scanner.nextInt();

                    int binaryResult =
                            SearchingOperations.binarySearch(
                                    numbers,
                                    binaryTarget);

                    if (binaryResult != -1) {

                        System.out.println(
                                "Value found using Binary Search.");

                        System.out.println(
                                "Index in sorted array: "
                                        + binaryResult);

                    } else {

                        System.out.println(
                                "Value not found using Binary Search.");
                    }

                    break;


                case 3:

                    System.out.println(
                            "Returning to Main Menu...");

                    break;


                default:

                    System.out.println(
                            "Invalid choice! Please try again.");
            }

        } while (choice != 3);
    }
}