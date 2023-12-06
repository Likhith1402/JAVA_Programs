/*
 1				1 2 3 4 5		1 2 3 4 5		1 				1
 1 2			1 2 3 4			2 3 4 5			2 1				0 1
 1 2 3			1 2 3			3 4 5			3 2 1			1 0 1
 1 2 3 4		1 2				4 5				4 3 2 1			0 1 0 1
 1 2 3 4 5		1				5				5 4 3 2 1		1 0 1 0 1
 
 5				5 4 3 2 1		5 4 3 2 1		5				1 0 1 0 1
 5 4			5 4 3 2			4 3 2 1			4 5				1 0 1 0
 5 4 3			5 4 3			3 2 1			3 4 5			1 0 1
 5 4 3 2		5 4				2 1				2 3 4 5			1 0
 5 4 3 2 1		5				1				1 2 3 4 5		1
 
 	1			* * * * *		* * * * *			*			   1
   1 2			* * * * *		*       *          * *            2 2
  1 2 3			* * * * *		*       *         *   *          3   3 
 1 2 3 4		* * * * *		*       *        *     *        4     4
1 2 3 4 5		* * * * *		* * * * *       * * * * *      5 5 5 5 5 

	1			1			1
   1 2	 		2 3			2 3
  1   3			4 5 6       6 5 4 
 1     4		7 8 9 10    7 8 9 10
1 2 3 4 5       . . . . .   15 14 13 12 11
    	
*/
public class Pattern {
	public static void main(String[] args) {
		int i=1;
		while(i<=5){
			int k=i;
			while(k<=5){
				System.out.print(" ");
				k++;
			}
			int j=1;
			while(j<=i){
				if(i==1 || i==5 || j==1 || j==i)
					System.out.print("* ");
				else
					System.out.print("  ");
				j++;
			}
			i++;
			System.out.println();
		}
		/*int i=1;
		while(i<=5){
			int j=1;
			while(j<=i){
				if(i==1 || i==5 || j==1 || j==i)
					System.out.print("* ");
				else
					System.out.print("  ");
				j++;
			}
			i++;
			System.out.println();
		}*/
		/*int i=1;
		while(i<=5){
			int j=1;
			while(j<=5){
				if(i==1 || i==5 || j==1 || j==5)
					System.out.print("* ");
				else
					System.out.print("  ");
				j++;
			}
			i++;
			System.out.println();
		}*/
		
		/*int i=1;									//i=1 2
		while(i<=5){								
			int k=i;								//k=2 3 4 5
			while(k<=5){
				System.out.print(" ");
				k++;
			}
			int j=1;								//j=1 2
			while(j<=i){ //1 2 3 4 5 				
				System.out.print(j+" ");
				j++;
			}
			System.out.println();
			i++;
		}*/
		
		/*int i=1;
		while(i<=5){
			int j=i;//1 2 3 4 5
			while(j>=1){  
				System.out.print(j%2+" ");
				j--;
			}
			System.out.println();
			i++;
		}*/
		/*int i=1;
		while(i<=5){
			int j=i;//1 2 3 4 5
			while(j>=1){  
				System.out.print(j+" ");
				j--;
			}
			System.out.println();
			i++;
		}*/

		/*int i=1;
		while(i<=5){
			int j=i;//1 2 3 4 5
			while(j<=5){  
				System.out.print(j+" ");
				j++;
			}
			System.out.println();
			i++;
		}*/

		/*int i=5;
		while(i>=1){
			int j=1;
			while(j<=i){ //5 4 3 2 1
				System.out.print(j+" ");
				j++;
			}
			System.out.println();
			i--;
		}*/

		/*int i=1;
		while(i<=5){
			int j=1;
			while(j<=i){ //1 2 3 4 5 
				System.out.print(j+" ");
				j++;
			}
			System.out.println();
			i++;
		}*/
	}
}


