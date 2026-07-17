import java.util.Scanner;
static class Solution112 {
    public boolean palindromeCheck(String s) {

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Solution112 sol = new Solution112();
        boolean ans = sol.palindromeCheck(s);

        System.out.println(ans);
    }