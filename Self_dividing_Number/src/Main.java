import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int left = 1;
		int right = 22;
		ArrayList<Integer> arr=new ArrayList<>();
        int count=0;
        while(left<=right)
        {
            int temp=left;
            while(temp>0)
            {
                int t=temp%10;
                if(t==0 || left%t!=0)
                {
                    count++;
                    break;
                }
                temp=temp/10;
            }
            if(count==0)
            {
                arr.add(left);
            }
            else
            {
                count=0;
            }
            left++;
        }
        System.out.println(arr);
	}

}
