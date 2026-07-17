import java.util.*;
class Solution121 {
    public List<List<Integer>> countFrequencies(int[] nums) {
        // Your code goes here

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            List<Integer> pair = new ArrayList<>();
            pair.add(entry.getKey());
            pair.add(entry.getValue());
            ans.add(pair);
        }

        return ans;
    }
    public static void main(String[] args) {
        Solution121 sol = new Solution121();
        int[] arr = {1, 2, 3, 2, 1};
        List<List<Integer>> result = sol.countFrequencies(arr);

        for (List<Integer> pair : result) {
            System.out.println("Number " + pair.get(0) + " occurs " + pair.get(1) + " times");
        }
    }
}

