import java.util.*;

public class findingfibonaci {
    public static void main(String[] args) {
        int temp1, temp2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check = ");
        int n = sc.nextInt();
        temp1 = (5 * n * n) + 4;
        temp2 = (5 * n * n) - 4;
        int root1 = (int) Math.sqrt(temp1);
        int root2 = (int) Math.sqrt(temp2);

        if (isPerfectSquare(temp1) || isPerfectSquare(temp2)) {
            System.out.println(n + " is a Fibonacci number");
        } else {
            System.out.println(n + " is not a Fibonacci number");
        }
        sc.close();
    }

    public static boolean isPerfectSquare(int x) {
        int sqrt = (int) Math.sqrt(x);
        return sqrt * sqrt == x;
    
        
    }
}
