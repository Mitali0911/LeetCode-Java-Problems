
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = {1,2,3};
		 for (int i = digits.length - 1; i >= 0; i--) {
	            if (digits[i] + 1 != 10) {
	                digits[i] += 1;
	                System.out.println(digits);
	            }
	}}

}
