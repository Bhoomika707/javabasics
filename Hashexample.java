 class Main111 {
    public static void main(String[] args) {
        int n = 5; // size of array
        int[] arr = {1, 2, 3, 2, 1}; // sample values

        // Print array elements
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Hash array to count frequencies
        int[] hash = new int[13]; // all initialized to 0
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        // Example: print frequency of numbers
        for (int number = 0; number < hash.length; number++) {
            if (hash[number] > 0) {
                System.out.println("Number " + number + " occurs " + hash[number] + " times");
            }
        }
    }
}

