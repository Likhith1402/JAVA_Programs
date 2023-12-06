import java.util.*;
public class palindrome {
   
    public static void main(String[] args) {
         int temp,rem,rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num = sc.nextInt();
        sc.close();
            temp = num;
         while(temp > 0){
         
             rem=temp % 10;
             rev = (rev*10) + rem;
             temp = temp / 10;
             
         }
        if (num == rev)
        
            System.out.println(num+" is Palindrome");
        else
        System.out.println(num+" is not a palindrome");
    sc.close();
    }

}
