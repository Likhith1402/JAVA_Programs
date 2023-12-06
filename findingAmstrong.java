import java.util.*;
public class findingAmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int cube = 0,sum = 0;
        int temp = n;
        while(n>0){
            int rem = n%10;
            cube = rem*rem*rem;
            sum = sum + cube;
            n = n/10;
        }
       
        if(sum == temp){
            System.out.println(temp+" is an amstrong number");
            }    else{
            System.out.println(temp+" is not an amstrong number");
        }
        sc.close();
    }

    
}
