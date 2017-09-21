
import java.util.Scanner;

public class GetYourBMI {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please input your height(m)£º");
		float h = sc.nextFloat();
		System.out.println("Please input your weight(kg)");
		float w = sc.nextFloat();
		System.out.println("BMI:"+w/h/h);
	}
}
