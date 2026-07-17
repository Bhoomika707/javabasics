import java.util.Arrays;
class Solution111 {
    public void reverseaarray(int[] arr, int n) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        Solution111 obj = new Solution111();
        obj.reverseaarray(arr, arr.length);

        System.out.println(Arrays.toString(arr));
}
}

