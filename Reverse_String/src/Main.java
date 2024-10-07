
public class Main {

	public static void main(String[] args) {
		String[] s = {"h","e","l","l","o"};
		int left = 0;
        int right = s.length - 1;

        while (left < right) {
            // Swap the characters at the left and right indices
            String temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // Move the pointers towards the center
            left++;
            right--;
            System.out.println(temp);

        }  
	}

}
