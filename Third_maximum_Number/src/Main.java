import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] nums = {3,2,1};
		int n=nums.length;
        Arrays.sort(nums);
        int count=1;
        for(int i=n-1;i>0;i--)
        {
            if(nums[i]!=nums[i-1])
            {
                count++;
            }
            if(count==3)
            {
               System.out.println(i-1);
            }
        }
        System.out.println(n-1);

	}

}
