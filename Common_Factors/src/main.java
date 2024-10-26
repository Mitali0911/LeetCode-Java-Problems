
public class main {

	public static void main(String[] args) {
		int a = 12;
		int b = 6;
		int s = 0;
        int n = Math.max(a, b);
        for (int i = 1; i <= n; i++) {
            if (a % i == 0 && b % i == 0)
                s++;
        }
       System.out.println(s);

	}

}
