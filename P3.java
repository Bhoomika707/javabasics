class Solution2 {
    public void pattern3(int n) {
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Solution2 sol=new Solution2();
        sol.pattern3(4);
        sol.pattern3(2);

    }
}