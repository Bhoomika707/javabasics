class Solution3 {
    public void pattern4(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Solution3 sol=new Solution3();
        sol.pattern4(4);
        sol.pattern4(2);

    }
}


