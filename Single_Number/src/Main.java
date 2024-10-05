
public class Main {

	public static void main(String[] args) {
		int[] nums = {2,2,1};
		int xor=0;
        for(int i=0;i<nums.length;i++)
        {
            xor=xor^nums[i];
        }
        System.out.println(xor);
	}

}
