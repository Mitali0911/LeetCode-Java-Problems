
public class Main {

	public static void main(String[] args) {
		int num1 = 12;
	    int num2 = 5;
	
		int l = -200;
		int r = 200;
        while (l < r) {
            int mid = (l + r) >> 1;
			if (mid == num1 + num2) { 
            	System.out.println(mid); }
            if (mid <  num1 + num2) l = mid + 1;
            if (mid >  num1 + num2) r = mid - 1;

	}
        System.out.println(l);
	}
}
