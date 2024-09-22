
public class Main {

	public static void main(String[] args) {
		int a = 121;
		int temp = a;
		int rev = 0;
		while(temp!=0) {
			int digit = temp % 10;
			rev = rev*10+digit;
			temp/=10;
			System.out.println(rev);
		}
		if(a<0) {
			System.out.println(false);
		}
		else if(rev == a) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		

	}

}
