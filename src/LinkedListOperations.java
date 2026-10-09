import java.util.Scanner;

/**
 * LinkedListOperations
 * Singly linked list component for the Data Structure & Graph Analyzer.
 * Operations: Insert (begin / end / position), Delete (value / position),
 *             Search (with step count), Display.
 * Author: Azeem
 */
public class LinkedListOperations {

    // ---------- Node ----------
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    // Last search result, so Main / PerformanceAnalyzer can use it
    private int lastSearchSteps = 0;
    private String lastSearchResult = "No search performed yet";

    // ---------- Insert ----------
    /** Insert at the beginning. O(1) */
    public void insertAtBeginning(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        size++;
        System.out.println("Inserted " + value + " at the beginning.");
    }

    /** Insert at the end. O(n) */
    public void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
        System.out.println("Inserted " + value + " at the end.");
    }

    /** Insert at a position (1-based). O(n) */
    public void insertAtPosition(int value, int position) {
        if (position < 1 || position > size + 1) {
            System.out.println("Invalid position! Valid range: 1 to " + (size + 1));
            return;
        }
        if (position == 1) {
            insertAtBeginning(value);
            return;
        }
        Node current = head;
        for (int i = 1; i < position - 1; i++) {
            current = current.next;
        }
        Node newNode = new Node(value);
        newNode.next = current.next;
        current.next = newNode;
        size++;
        System.out.println("Inserted " + value + " at position " + position + ".");
    }

    // ---------- Delete ----------
    /** Delete first node having the given value. O(n) */
    public void deleteByValue(int value) {
        if (isEmpty()) {
            System.out.println("List is empty! Nothing to delete.");
            return;
        }
        if (head.data == value) {
            head = head.next;
            size--;
            System.out.println("Deleted " + value + ".");
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Value " + value + " not found. Nothing deleted.");
        } else {
            current.next = current.next.next;
            size--;
            System.out.println("Deleted " + value + ".");
        }
    }

    /** Delete node at a position (1-based). O(n) */
    public void deleteByPosition(int position) {
        if (isEmpty()) {
            System.out.println("List is empty! Nothing to delete.");
            return;
        }
        if (position < 1 || position > size) {
            System.out.println("Invalid position! Valid range: 1 to " + size);
            return;
        }
        int removed;
        if (position == 1) {
            removed = head.data;
            head = head.next;
        } else {
            Node current = head;
            for (int i = 1; i < position - 1; i++) {
                current = current.next;
            }
            removed = current.next.data;
            current.next = current.next.next;
        }
        size--;
        System.out.println("Deleted " + removed + " from position " + position + ".");
    }

    // ---------- Search ----------
    /** Linear search through the list. Counts steps. O(n) */
    public int search(int value) {
        lastSearchSteps = 0;
        if (isEmpty()) {
            lastSearchResult = "List is empty";
            System.out.println("List is empty! Cannot search.");
            return -1;
        }
        Node current = head;
        int position = 1;
        while (current != null) {
            lastSearchSteps++;
            if (current.data == value) {
                lastSearchResult = "Found " + value + " at position " + position;
                System.out.println(lastSearchResult + " (steps: " + lastSearchSteps + ")");
                return position;
            }
            current = current.next;
            position++;
        }
        lastSearchResult = value + " not found";
        System.out.println(value + " not found in the list (steps: " + lastSearchSteps + ")");
        return -1;
    }

    // ---------- Display ----------
    public void display() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }
        System.out.print("Linked List: ");
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
        System.out.println("Size: " + size);
    }

    // ---------- Helpers ----------
    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public int getLastSearchSteps() {
        return lastSearchSteps;
    }

    public String getLastSearchResult() {
        return lastSearchResult;
    }

    // ---------- Input validation ----------
    private int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a whole number.");
            }
        }
    }

    // ---------- Submenu (called from Main) ----------
    public void showMenu(Scanner sc) {
        int choice;
        do {
            System.out.println("\n------------ LINKED LIST OPERATIONS ------------");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Delete by Value");
            System.out.println("5. Delete by Position");
            System.out.println("6. Search");
            System.out.println("7. Display");
            System.out.println("8. Return to Main Menu");
            choice = readInt(sc, "Enter your choice: ");

            switch (choice) {
                case 1:
                    insertAtBeginning(readInt(sc, "Enter value: "));
                    break;
                case 2:
                    insertAtEnd(readInt(sc, "Enter value: "));
                    break;
                case 3:
                    int v = readInt(sc, "Enter value: ");
                    int p = readInt(sc, "Enter position (1-" + (size + 1) + "): ");
                    insertAtPosition(v, p);
                    break;
                case 4:
                    deleteByValue(readInt(sc, "Enter value to delete: "));
                    break;
                case 5:
                    deleteByPosition(readInt(sc, "Enter position to delete: "));
                    break;
                case 6:
                    search(readInt(sc, "Enter value to search: "));
                    break;
                case 7:
                    display();
                    break;
                case 8:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter 1-8.");
            }
        } while (choice != 8);
    }
}
