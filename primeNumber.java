import java.util.*;
public class primeNumber {
    int num;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
         int num = sc.nextInt();
        int i = 1,count = 0;
         while (i<= num)
        {
            if (num % i == 0){
                count++;
            }
                  
            i++;
        }
        if (count == 2)
            System.out.println(num + " is a prime number");
        else 
            System.out.println(num + " is not a prime number");
    sc.close();
    }
    
}
