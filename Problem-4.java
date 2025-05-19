import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        // Input list of numbers
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        // Map to store counts for 1 to 9
        Map<Integer, Integer> countMap = new HashMap<>();

        // Initialize the map with keys 1 through 9 and value 0
        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }

        // Count how many numbers are divisible by each number from 1 to 9
        for (int i = 1; i <= 9; i++) {
            for (int num : numbers) {
                if (num % i == 0) {
                    countMap.put(i, countMap.get(i) + 1);
                }
            }
        }

        // Print the result
        System.out.println("Output:");
        System.out.println(countMap);
    }
}
