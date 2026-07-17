

import java.util.Scanner;

public class Sum2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter low number: ");

        int low = sc.nextInt();
        System.out.println("Enter high number");
        int high=sc.nextInt();

        int sum = 0;

        for(int i=low;i<=high;i++){

            sum = sum + i;

        }

        System.out.println(sum);

    }
}