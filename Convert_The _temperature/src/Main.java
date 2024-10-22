import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in fahrenhite");
		int far = sc.nextInt();
		int celsius = (far-32)*5/9;
		System.out.println(celsius);

	}

}
