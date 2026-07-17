class Solution5 {
    public void pattern10(int n) {
        for(int i=0;i<=n;i++){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Solution5 sol=new Solution5();
        sol.pattern10(4);
        sol.pattern10(2);

    }
}
