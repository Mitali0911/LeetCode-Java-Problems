
public class Main {

	public static void main(String[] args) {
		String s = "Hello World";
		s=s.trim();
        String[] words=s.split(" ");
     System.out.println( words[words.length-1].length());

	}

}
