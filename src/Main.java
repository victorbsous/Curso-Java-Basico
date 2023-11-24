import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x;
		double y; 
		double z;
		double med;

		x = sc.nextDouble();
		y = sc.nextDouble();
		z = sc.nextDouble();

		med = (x * 2 + y * 3 + z *5) / 10.0;

		System.out.printf("MEDIA = %.1f\n", med);

		sc.close();
	}
}
