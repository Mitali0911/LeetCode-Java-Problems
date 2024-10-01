public class Main {

	public static void main(String[] args) {
		int n=3;
		for(int i = 0; i<=n; i++) {
			if(i%3==0 & i%5==0) {
				System.out.println("Fizz");
				break;
			}
			else {
				System.out.println("Fizz Buzz");
			}
		}
	}

}
