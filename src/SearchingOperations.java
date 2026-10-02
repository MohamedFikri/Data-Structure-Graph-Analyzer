import java.util.Arrays;

public class SearchingOperations {

    // Linear Search
    public static int linearSearch(int[] array, int target) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }

        return -1;
    }

    // Binary Search
    public static int binarySearch(int[] array, int target) {

        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);

        int left = 0;
        int right = sortedArray.length - 1;

        while (left <= right) {

            int middle = (left + right) / 2;

            if (sortedArray[middle] == target) {
                return middle;
            }

            if (sortedArray[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }
}