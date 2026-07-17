import java.util.Scanner;
public class Marks {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks:");
        int marks=sc.nextInt();
        if(marks>=90){
            System.out.println("Excellent");
        }
        else if(marks>=70){
            System.out.println("Good");
        }
        else{
            System.out.println("Average");
        }
    }
}
