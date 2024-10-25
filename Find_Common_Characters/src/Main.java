import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String[] words = {"bella","label","roller"};
		 int n = words.length, j;
	        int[][] freq = new int[n-1][26];
	        for (int i = 1; i < n; i++)
	            for (char c : words[i].toCharArray())
	                freq[i-1][c-'a']++;
	        List<String> res = new ArrayList<>();
	        for (char c : words[0].toCharArray()){
	            for (j = 1; j < n; j++){
	                if (freq[j-1][c-'a'] > 0)
	                    freq[j-1][c-'a']--;
	                else
	                    break;
	            }
	            if (j == n)
	                res.add(c + "");
	        }
	        System.out.println(res);
	}

}
