class Solution115 {

    public static void printNames(int n) {

        if (n == 0) {
            return;
        }

        System.out.println("name:Bhoomi");
        printNames(n - 1);
    }

    public static void main(String[] args) {
        printNames(5);
    }
}
