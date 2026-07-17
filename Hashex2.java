import java.util.*;

class Solution122 {
    public int mostFrequentElement(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Step 1: Count frequencies
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find max frequency and smallest element
        int maxFreq = 0;
        int result = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > maxFreq || (frequency == maxFreq && number < result)) {
                maxFreq = frequency;
                result = number;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution122 sol = new Solution122();
        int[] nums = {1, 2, 2, 3, 3, 3};
        System.out.println(sol.mostFrequentElement(nums)); // Output: 3
    }
}
