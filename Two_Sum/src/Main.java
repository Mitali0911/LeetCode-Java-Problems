
public class Main {

	public static void main(String[] args) {
		 int[] sum = {1,2,3,4,5,6,7};
		 int target = 9;
		 for(int i = 0; i< sum.length; i++) {
			 for(int j = i+1; j< sum.length; j++) {
				 if(sum[i]+sum[j]==target) {
					 System.out.println(i+","+j);
				 }
			 }
		 }
}
}
