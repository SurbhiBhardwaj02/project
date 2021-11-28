import java.util.InputMismatchException;
import java.util.Scanner;

public class MathOperation {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr =new int[5];

        try {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }
            int sum = 0;
            double average = 0;
            for (int i = 0; i < args.length; i++) {
                sum += arr[i];
                average = sum / arr.length;
            }
            System.out.println("Sum is : " + sum);
            System.out.println("Average is : " + average);
        }
        catch (NumberFormatException|ArithmeticException|InputMismatchException|ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }



    }
}
