
public class Main {

	public static void main(String[] args) {
		int num=16;
		  int q = num / 4;
	        int i = 1;
	        while (i <= q + 1) {
	            if (i * i == num) {
	               System.out.println("The number is a perfect square");
	            } else {
	                i++;
	               System.out.println("The number is not a perfect square");
	            }
	        }
	        
	}

}
