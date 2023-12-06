import java.util.*;
public class fibonacciSeries {
    public static void main(String[] args) {
        int n1=0,n2=1,n3;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms = ");
        int choice = sc.nextInt();
       
        int i = 1;
       
        while (i<=choice){
            
            System.out.print(n1+"  ");
            n3=n1+n2;
            n1=n2;
            n2=n3;
            i++;
        }

         sc.close();           
    }
}
