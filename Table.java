class Table{
	public static void main(String[] args){
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("Read any number : ");
		int n=sc.nextInt(); //5
		int i=1;
		while(i<=10){
			int mul=n*i;
			System.out.println(n+" * "+i+" = "+mul);
			i++;
		}
		sc.close();
	}
}