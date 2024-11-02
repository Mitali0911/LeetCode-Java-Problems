import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		int[] nums = {3,2,3};
		 HashMap<Integer, Integer> hash = new HashMap<>();
	        int res = 0;
	        int majority = 0;

	        for (int n : nums) {
	            hash.put(n, 1 + hash.getOrDefault(n, 0));
	            if (hash.get(n) > majority) {
	                res = n;
	                majority = hash.get(n);
	            }
	        }

	        System.out.println(res);  

	}

}
