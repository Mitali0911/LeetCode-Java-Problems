
public class Main {

	public static void main(String[] args) {
		int num = 38;
		int n =num;
        while(n/10 != 0){
            int sum = 0;
            while(n/10 != 0){
                sum+=(n%10);
                n/=10;
            }
            sum+=n;
            n=sum;
            System.out.println(n);
        }

	}

}
