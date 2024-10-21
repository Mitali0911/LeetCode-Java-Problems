
public class Main {

	public static void main(String[] args) {
		int num = 100;
		if(num == 0){
           System.out.println(0);;
        }
        
        int f = 0;
        StringBuilder sb = new StringBuilder();
        
        if(num < 0){
            f = 1;
            num = -num;
        }
        
        while(num > 0){
            sb.append(num % 7);
            num /= 7;
        }
        
        String ori = sb.reverse().toString();
        
        if(f == 1){
            System.out.println(ori);
        }
        
        System.out.println(ori);
	}

}
