
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayOperations arrayOperations = new ArrayOperations(10);
        StackOperations stackOperations = new StackOperations();
        QueueOperations queueOperations = new QueueOperations();
        LinkedListOperations linkedListOperations = new LinkedListOperations();
        CampusGraph campusGraph = new CampusGraph();

        int choice = 0;

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

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine();
                continue;
            }

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    arrayMenu(scanner, arrayOperations);
                    break;

                case 2:
                    stackMenu(scanner, stackOperations);
                    break;

                case 3:
                    queueMenu(scanner, queueOperations);
                    break;

                case 4:
                    linkedListOperations.showMenu(scanner);
                    break;

                case 5:
                    searchingMenu(scanner);
                    break;

                case 6:
                    graphMenu(scanner, campusGraph);
                    break;

                case 7:
                    PerformanceAnalyzer.compareSearchPerformance();
                    break;

                case 8:
                    System.out.println("\n========== ALL RESULTS ==========");
                    System.out.println("\nArray:");
                    arrayOperations.display();

                    System.out.println("\nStack:");
                    stackOperations.display();

                    System.out.println("\nQueue:");
                    queueOperations.display();

                    System.out.println("\nLinked List:");
                    linkedListOperations.display();

                    System.out.println("\nCampus Graph:");
                    campusGraph.displayGraph();
                    break;

                case 9:
                    System.out.println("Exiting program. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 9);

        scanner.close();
    }

    // =========================================
    // ARRAY OPERATIONS
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

            choice = readInt(scanner);

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    arrayOperations.insert(readInt(scanner));
                    break;

                case 2:
                    System.out.print("Enter value to delete: ");
                    arrayOperations.delete(readInt(scanner));
                    break;

                case 3:
                    System.out.print("Enter value to search: ");
                    int index = arrayOperations.search(readInt(scanner));

                    if (index != -1) {
                        System.out.println("Value found at index: " + index);
                    } else {
                        System.out.println("Value not found!");
                    }
                    break;

                case 4:
                    arrayOperations.display();
                    break;

                case 5:
                    System.out.println("Returning to Main Menu...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }

    // =========================================
    // STACK OPERATIONS
    // =========================================

    public static void stackMenu(
            Scanner scanner,
            StackOperations stackOperations) {

        int choice;

        do {
            System.out.println("\n---------- STACK OPERATIONS ----------");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Return to Main Menu");
            System.out.print("Enter your choice: ");

            choice = readInt(scanner);

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    stackOperations.push(readInt(scanner));
                    break;

                case 2:
                    stackOperations.pop();
                    break;

                case 3:
                    stackOperations.peek();
                    break;

                case 4:
                    stackOperations.display();
                    break;

                case 5:
                    System.out.println("Returning to Main Menu...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }

    // =========================================
    // QUEUE OPERATIONS
    // =========================================

    public static void queueMenu(
            Scanner scanner,
            QueueOperations queueOperations) {

        int choice;

        do {
            System.out.println("\n---------- QUEUE OPERATIONS ----------");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Return to Main Menu");
            System.out.print("Enter your choice: ");

            choice = readInt(scanner);

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    queueOperations.enqueue(readInt(scanner));
                    break;

                case 2:
                    queueOperations.dequeue();
                    break;

                case 3:
                    queueOperations.peek();
                    break;

                case 4:
                    queueOperations.display();
                    break;

                case 5:
                    System.out.println("Returning to Main Menu...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }

    // =========================================
    // SEARCHING OPERATIONS
    // =========================================

    public static void searchingMenu(Scanner scanner) {

        int[] numbers = {10, 25, 5, 40, 15, 30, 20, 50};
        int choice;

        do {
            System.out.println("\n---------- SEARCHING OPERATIONS ----------");
            System.out.println("Current Data: 10 25 5 40 15 30 20 50");
            System.out.println("1. Linear Search");
            System.out.println("2. Binary Search");
            System.out.println("3. Return to Main Menu");
            System.out.print("Enter your choice: ");

            choice = readInt(scanner);

            switch (choice) {
                case 1:
                    System.out.print("Enter value to search: ");
                    int linearTarget = readInt(scanner);

                    int linearResult =
                            SearchingOperations.linearSearch(numbers, linearTarget);

                    if (linearResult != -1) {
                        System.out.println("Value found using Linear Search.");
                        System.out.println("Index: " + linearResult);
                    } else {
                        System.out.println("Value not found using Linear Search.");
                    }
                    break;

                case 2:
                    System.out.print("Enter value to search: ");
                    int binaryTarget = readInt(scanner);

                    int binaryResult =
                            SearchingOperations.binarySearch(numbers, binaryTarget);

                    if (binaryResult != -1) {
                        System.out.println("Value found using Binary Search.");
                        System.out.println("Index in sorted array: " + binaryResult);
                    } else {
                        System.out.println("Value not found using Binary Search.");
                    }
                    break;

                case 3:
                    System.out.println("Returning to Main Menu...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);
    }

    // =========================================
    // GRAPH OPERATIONS
    // =========================================

    public static void graphMenu(Scanner scanner, CampusGraph graph) {

        int choice;

        do {
            System.out.println("\n---------- GRAPH OPERATIONS ----------");
            System.out.println("1. Add Location");
            System.out.println("2. Add Connection");
            System.out.println("3. Remove Location");
            System.out.println("4. Remove Connection");
            System.out.println("5. Display Graph");
            System.out.println("6. BFS Traversal");
            System.out.println("7. DFS Traversal");
            System.out.println("8. Return to Main Menu");
            System.out.print("Enter your choice: ");

            choice = readInt(scanner);

            switch (choice) {
                case 1:
                    System.out.print("Enter location: ");
                    String location = scanner.nextLine();

                    System.out.println(graph.addVertex(location)
                            ? "Location added successfully!"
                            : "Unable to add location.");
                    break;

                case 2:
                    System.out.print("From location: ");
                    String from = scanner.nextLine();

                    System.out.print("To location: ");
                    String to = scanner.nextLine();

                    System.out.println(graph.addEdge(from, to)
                            ? "Connection added successfully!"
                            : "Unable to add connection. Check locations.");
                    break;

                case 3:
                    System.out.print("Enter location to remove: ");
                    String removeLocation = scanner.nextLine();

                    System.out.println(graph.removeVertex(removeLocation)
                            ? "Location removed!"
                            : "Location not found.");
                    break;

                case 4:
                    System.out.print("From location: ");
                    String removeFrom = scanner.nextLine();

                    System.out.print("To location: ");
                    String removeTo = scanner.nextLine();

                    System.out.println(graph.removeEdge(removeFrom, removeTo)
                            ? "Connection removed!"
                            : "Connection not found.");
                    break;

                case 5:
                    graph.displayGraph();
                    break;

                case 6:
                    System.out.print("Enter starting location: ");
                    String bfsStart = scanner.nextLine();
                    System.out.println("BFS Traversal: "
                            + graph.bfsTraversal(bfsStart));
                    break;

                case 7:
                    System.out.print("Enter starting location: ");
                    String dfsStart = scanner.nextLine();
                    System.out.println("DFS Traversal: "
                            + graph.dfsTraversal(dfsStart));
                    break;

                case 8:
                    System.out.println("Returning to Main Menu...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 8);
    }

    // =========================================
    // INPUT VALIDATION
    // =========================================

    public static int readInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input! Enter a number: ");
            scanner.nextLine();
        }

        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }
}
