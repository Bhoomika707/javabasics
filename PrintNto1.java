class Solution113 {
     public static void PrintNumbers(int n) {
         if (n == 0) {
             return;
         }
         System.out.println(n);
         PrintNumbers(n - 1);
     }

     public static void main(String[] args) {
         PrintNumbers(5);
     }
 }