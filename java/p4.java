import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        double b = sc.nextInt();  
        System.out.println("Sum: " + (a + b));
    }
}
