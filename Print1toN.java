class Solution114{
    public static void printNumbers1(int n){
        if(n==0){
            return;
        }
        printNumbers1(n-1);
        System.out.println(n);
    }
public static void main(String[] args){
    printNumbers1(5);
}
}
