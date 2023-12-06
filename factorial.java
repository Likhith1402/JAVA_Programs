import java.util.*;
class factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number = ");
        
        long num,fact = 1;

        num = sc.nextLong();

        for (int i=1;i<=num;i++){
            fact = fact * i;
                }
    
        System.out.println("Factorial of the number = "+fact);
        sc.close();
    }
}