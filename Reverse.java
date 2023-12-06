/*
	n=1234		n=123		n=12		n=1		n=0
	sum=0+4		sum=4+3		sum=7+2		sum=9+1=10
	10|1234|123	10|123|12	10|12|1		10|1|0	
	   1230		   120		   10		   0
	   ====		   ===		   ==		   =	
	      4		     3		    2		   1	
	      0*10+4	
	      4*10+3	

*/

class Reverse{
	public static void main(String[] args){
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("Read any number: ");
		int n=sc.nextInt();//1234
		System.out.println("Given Number : "+n);	
		int rev=0;
		while(n!=0){
		    int rem=n%10;
		    rev=rev*10+rem;
		    n=n/10;	
		}
		System.out.println("Reverse : "+rev);
	
		sc.close();
	}
}













