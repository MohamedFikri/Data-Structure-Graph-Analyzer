public class Member3Test {
    public static void main(String[] args) {

        LinkedListOperations list = new LinkedListOperations();

        System.out.println("=== LINKED LIST TEST ===");

        // Insert
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        // Display
        list.display();

        // Search
        list.search(20);

        // Delete
        list.deleteByValue(20);

        // Display after deletion
        list.display();

        // Search missing value
        list.search(50);

        // Empty list test
        System.out.println("=== EMPTY LIST TEST ===");

        LinkedListOperations emptyList =
                new LinkedListOperations();

        emptyList.display();
        emptyList.deleteByValue(10);
        emptyList.search(10);
    }
}