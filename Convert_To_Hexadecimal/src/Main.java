
public class Main {

	public static void main(String[] args) {
		int num = 26;
char[] hexas = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        
        if (num == 0) {
        	System.out.println(0);
        }
        if (num > 0 && num <= 15) {
        	Character.toString(hexas[num]);
        }

        long n = num;  
        if (n < 0) n += (1L << 32);
        
        StringBuilder result = new StringBuilder();
        
        while (n > 0) {
            result.insert(0, hexas[(int)(n % 16)]);
            n /= 16;
        }
        
        System.out.println(result.toString());

	}

}