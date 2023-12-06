import java.util.*;
public class lowerRightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of coloumns = ");
        int numCols = scanner.nextInt();

         int i=1;
             while(i <= numCols){ // i = 1 2 3 4 5
                  int k = i;
                  while (k <= numCols){
                    System.out.print(" ");
                    k++;
                  }
	            int j=1;   	
	            while(j <= i){
	            System.out.print(j+ " ");
	                j++;
	                }
	            i++;
	            System.out.println();
            }
        
        /*int i = 1;
        while (i<=numCols) {        //number of coloumns is 5
            
            int j = 1;
            while (j <=i){
                j++;
                System.out.print("*  ");
            }
            
            System.out.println();
            i++;
        }*/
        scanner.close();
    }
    
}
