/*
Multiplication of two numbers using Russian Multiplication Algorithm.

	n1	n2	sum=0+12+24+96=132
	11	12
	5	24
	2	48[Ignore]
	1	96
	0
*/
class RussianMultiplication{
	public static void main(String[] args){	
		int n1=11,n2=12,sum=0;
		System.out.print("Multiplication of "+n1+" and "+n2+" = ");
		while(n1!=0){
		     if(n1%2==1)
			sum=sum+n2;
		     n1=n1/2;
		     n2=n2*2;
		}
		System.out.println(sum);
	}
}










