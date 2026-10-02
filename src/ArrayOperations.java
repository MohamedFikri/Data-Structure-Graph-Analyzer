public class ArrayOperations {

    private int[] array;
    private int size;

    public ArrayOperations(int capacity) {
        array = new int[capacity];
        size = 0;
    }

    // Insert a value
    public void insert(int value) {
        if (size == array.length) {
            System.out.println("Array is full!");
            return;
        }

        array[size] = value;
        size++;
        System.out.println(value + " inserted successfully.");
    }

    // Delete a value
    public void delete(int value) {
        int index = -1;

        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Value not found!");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;
        System.out.println(value + " deleted successfully.");
    }

    // Search for a value
    public int search(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // Display all values
    public void display() {
        if (size == 0) {
            System.out.println("Array is empty!");
            return;
        }

        System.out.print("Array: ");

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }
}