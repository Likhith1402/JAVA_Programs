import java.util.*;

public class transposeofMatrix {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the number of rows : ");
       int p = scanner.nextInt();
       System.out.print("Enter the number of columns : ");
       int q = scanner.nextInt();
        int[][] matrix = null;
        matrix = new int[p][q];

        // taking the input matrix

        for (int i = 0; i < p; i++){
            for (int j = 0; j < q; j++){
                System.out.print("Enteer the "+i+" "+j+" elements of the matrix : ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        // printing the matrix
        for (int i = 0; i < p; i++){
            for (int j = 0; j < q; j++){
                System.out.print(matrix[j][i] +" ");
            }
            System.out.println();
        
        }
         // transpose of a matrix
         for (int i = 0; i < p; i++){
            for (int j = 0; j < q; j++){
                System.out.print(matrix[i][j] +" ");
                }
            System.out.println();
        }

    }
    
}
