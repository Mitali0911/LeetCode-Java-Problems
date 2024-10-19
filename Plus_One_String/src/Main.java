
public class Main {

	public static void main(String[] args) {
		String num = "52";
		for(int i=num.length();i>=0;i--){
            if(i!=0 && num.charAt(i-1)%2!=0) {
               System.out.println(num.substring(0,i));
            }
            if(i==0){
                if(i%2!=0)
                	System.out.println(num.substring(0,1));
        }
        }
        
	}

}
