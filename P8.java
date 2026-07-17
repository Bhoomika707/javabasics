 class Solution8 {
     public void pattern8(int n) {
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < i; j++) {
                 System.out.print(" ");
             }
             for (int j = 0;j < 2*n-(2 * i + 1);j++){
                 System.out.print("*");
             }
             for (int j = 0; j < i; j++) {
                 System.out.print(" ");
             }
             System.out.println();
         }
         }
         public static void main (String[] args){
             Solution8 sol = new Solution8();
             sol.pattern8(4);
             sol.pattern8(2);

         }
     }

