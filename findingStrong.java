    import java.util.*;
    public class findingStrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        while(n>0){
            int rem = n%10;
            int i = 1,fact = 1;
                while(i<=rem){
                fact = fact * i;
                i++;
            }
            sum = sum + fact;
            n = n/10;
        }
        
        if (sum == temp)
        System.out.println(temp+" is a strong number");
        else
        System.out.println(temp+" is not a strong number");
        
        sc.close();
    }
    }
