class Solution1 {
    public void pattern2(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        Solution1 sol=new Solution1();
        sol.pattern2(4);
        sol.pattern2(2);
    }
}
