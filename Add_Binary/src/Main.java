
public class Main {

	public static void main(String[] args) {
		String a = "11";
	    String b = "1";
		 StringBuilder result = new StringBuilder();
	        int i = a.length() - 1, j = b.length() - 1, carry = 0;
	        while (i >= 0 || j >= 0 || carry == 1) {
	            int total = carry;
	            if (i >= 0) total += a.charAt(i--) - '0';
	            if (j >= 0) total += b.charAt(j--) - '0';
	            result.append(total % 2);
	            carry = total / 2;
	        }
	        System.out.println( result.reverse().toString());

	}

}
