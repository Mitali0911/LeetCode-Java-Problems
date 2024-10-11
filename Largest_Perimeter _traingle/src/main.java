import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,1,2};
		   Arrays.sort(nums);
		    for(int i=nums.length-1;i>1;i--){
		        int a = nums[i-2];
		        int b = nums[i-1];
		        int c = nums[i];
					int s = a + b + c;
		        if(a+b>c)
				{
		            System.out.println(s);
		        }
		    }
	}

}
