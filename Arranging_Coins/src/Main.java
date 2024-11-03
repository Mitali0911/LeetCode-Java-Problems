
public class Main {

	public static void main(String[] args) {
		int n = 5;
		int i = 1;
        while (n > 0) {
            i ++;
            n -= i;
        }
        System.out.println(i - 1);

	}

}
