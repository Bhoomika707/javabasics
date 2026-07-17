class Solution4 {
    public void pattern5(int n) {
        for(int i=1;i<=n;i++){//n-row+1
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        Solution4 sol=new Solution4();
        sol.pattern5(4);
        sol.pattern5(2);
    }
}

