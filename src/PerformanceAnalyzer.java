import java.util.Arrays;

public class PerformanceAnalyzer {

    public static void compareSearchPerformance() {

        int[] numbers = {10, 25, 5, 40, 15, 30, 20, 50};
        int target = 50;

        System.out.println("\n=============================================");
        System.out.println(" PERFORMANCE COMPARISON");
        System.out.println("=============================================");
        System.out.println("Target Value: " + target);

        // ---------------- LINEAR SEARCH ----------------

        int linearSteps = 0;
        int linearResult = -1;

        long linearStart = System.nanoTime();

        for (int i = 0; i < numbers.length; i++) {
            linearSteps++;

            if (numbers[i] == target) {
                linearResult = i;
                break;
            }
        }

        long linearEnd = System.nanoTime();
        long linearTime = linearEnd - linearStart;

        // ---------------- BINARY SEARCH ----------------

        int[] sortedArray = numbers.clone();
        Arrays.sort(sortedArray);

        int left = 0;
        int right = sortedArray.length - 1;

        int binarySteps = 0;
        int binaryResult = -1;

        long binaryStart = System.nanoTime();

        while (left <= right) {

            binarySteps++;

            int middle = (left + right) / 2;

            if (sortedArray[middle] == target) {
                binaryResult = middle;
                break;
            }

            if (sortedArray[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        long binaryEnd = System.nanoTime();
        long binaryTime = binaryEnd - binaryStart;

        // ---------------- RESULTS ----------------

        System.out.println("\n---------------------------------------------");
        System.out.println("Algorithm       Result      Steps      Time(ns)");
        System.out.println("---------------------------------------------");

        System.out.printf(
                "%-15s %-11s %-10d %d%n",
                "Linear Search",
                linearResult != -1 ? "Found" : "Not Found",
                linearSteps,
                linearTime
        );

        System.out.printf(
                "%-15s %-11s %-10d %d%n",
                "Binary Search",
                binaryResult != -1 ? "Found" : "Not Found",
                binarySteps,
                binaryTime
        );

        System.out.println("---------------------------------------------");

        System.out.println("\nComplexity:");
        System.out.println("Linear Search : O(n)");
        System.out.println("Binary Search : O(log n)");

        System.out.println(
                "\nNote: Execution time may vary between runs.");
    }
}