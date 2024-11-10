
public class Main {

	public static void main(String[] args) {
		int n = 6;
		 if(n==0) {
			 System.out.println(1);
		 }
	        if(n > 0 && n <= 3) {
				 System.out.println(0);
			 }
	        if(n % 2 == 0) {
				 System.out.println("isUgly" + (n/2));
	        }
	        if(n % 3 == 0)  {
				 System.out.println("isUgly" + (n/3));
	        }
	        if(n % 5 == 0)  {
				 System.out.println("isUgly" + (n/5));
	        }

	}

}
