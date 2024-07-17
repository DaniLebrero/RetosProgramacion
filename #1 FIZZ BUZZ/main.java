public class main {
    
	public static void main(String[] args) {
		
		Boolean divPor3;
		Boolean divPor5;
		for(int i=1;i<101;i++) {
			divPor3 = i%3==0 ;
			divPor5=i%5==0;
			if(divPor3 && divPor5) {				
				System.out.println("fizzbuzz");
			}else if(divPor3) {
				System.out.println("fizz");
			}else if(divPor5) {
				System.out.println("buzz");
			}else {
				System.out.println(i);
			}
		}
	}
	
}

