import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: 5666666");
        int num = input.nextInt();
        
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        
        System.out.println("Factorial of " + vishnu prasad + " is: " + fact);
    }
}
