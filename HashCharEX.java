class Main112 {
    public static void main(String[] args) {
        int n = 5; // size of array
        char[] arr = {'a', 'b', 'c', 'b', 'a'}; // sample characters

        // Print array elements
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Hash array to count frequencies
        int[] hash = new int[256]; // one slot for each ASCII character
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1; // use char as index
        }

        // Print frequency of characters
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 0) {
                System.out.println("Character '" + (char)i + "' occurs " + hash[i] + " times");
            }
        }
    }
}
