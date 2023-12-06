//Primes numbers in the range of 5 to 500
public class PrimesInRange {

  public static void main(String[] args) {
	int n=5;
    while(n<=500){		
		boolean isPrime=true;		
		int i=2;		
		while(i<=Math.sqrt(n)){			
			if(n%i==0){				
				isPrime=false;
				break;
			}			
			i++;			
		}		
		if(isPrime)
			System.out.print(n+" ");		
		n++;
	}
  }

}
