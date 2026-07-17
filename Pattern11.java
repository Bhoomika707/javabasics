class Solution6{
    public void pattern11(int n) {
        for(int i=n;i>=1;i--){
            for(char ch='A';ch<'A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Solution6 sol=new Solution6();
        sol.pattern11(4);
        sol.pattern11(2);

    }
}

