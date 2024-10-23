
public class Main {

	public static void main(String[] args) {
		int n = 7;
		int s=0;
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 || i%5==0 || i%7==0)
            s = s+i;
        }
        
        System.out.println(s);

	}

}
