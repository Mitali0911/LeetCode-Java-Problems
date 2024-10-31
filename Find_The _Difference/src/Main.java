
public class Main {

	public static void main(String[] args) {
		String s = "abcd";
        String t = "abcde";
		StringBuilder sb = new StringBuilder(s);
        int i=0;
        for(i=0;i<t.length();i++){
            for(int j=0;j<sb.length();j++){
                if(sb.charAt(j)==t.charAt(i)){
                    sb.deleteCharAt(j);
                    break;
                }
                if(j==sb.length()-1){
                   System.out.println( t.charAt(i));
                }
            }
        }
        System.out.println( t.charAt(i-1));
	}

}
