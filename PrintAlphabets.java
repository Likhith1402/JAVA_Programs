
public class PrintAlphabets {

	public static void main(String[] args) {
		for(int ch=65;ch<=122;ch++){
			if(ch>=91 && ch<=96)
				//break;
				continue;
			System.out.println(ch + " => "+(char)ch);
		}
		
		for(int i=1;i<=20;i++){
			if(i%2==0)
				continue;
			System.out.println(i);
		}

	}

}
