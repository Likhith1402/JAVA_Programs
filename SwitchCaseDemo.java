class SwitchCaseDemo{
	public static void main(String[] args){
	   int n,choice;
	   java.util.Scanner sc=new java.util.Scanner(System.in);
	   do{
		System.out.println("M  E  N  U");
		System.out.println("1: Sum of digits");
		System.out.println("2: Reverse of number");
		System.out.println("3: Even Odd Check");
		System.out.println("4: Palindrome Check");
		System.out.println("5: Exit");
		System.out.print("Read a choice:[1 2 3 4]: ");
		choice=sc.nextInt(); //1
		switch(choice){
			case 1:
				System.out.print("Read any two digit number: ");
				n=sc.nextInt();
				int sum=n/10+n%10;
				System.out.println("Given Number: "+n);
				System.out.println("Sum of digits: "+sum);
				break;
			case 2:
				System.out.print("Read any two digit number: ");
				n=sc.nextInt();
				int rev=(n%10)*10+(n/10);
				System.out.println("Given number: "+n);
				System.out.println("Reverse: "+rev);
				break;
			case 3:
				System.out.print("Read any number: ");
				n=sc.nextInt();
				if(n%2==0)
					System.out.println(n+" is an even number");
				else
					System.out.println(n+" is an odd number");
				break;
			case 4:
				System.out.print("Read any 3 digit number: ");
				n=sc.nextInt();//121
				if(n/100==n%10)
					System.out.println(n+" is palindrome");
				else
					System.out.println(n+" is not palindrome");
				break;
			case 5:
				System.out.println("About to exit.");
				break;
			default:
				System.out.println("Invalid choice, try again ...");
				break;
		}//End of switch-case
	   }while(choice!=5);	
	   System.out.println("End of application");
	   
	   sc.close();
	}//End of main
}//End of class


