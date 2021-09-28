import java.util.Scanner;
public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("¬вед≥ть ц≥ле число: ");
		if(sc.hasNextInt()) {
			int number = sc.nextInt();
			int sum = 0;
			int product;
			for (int i = 1; i <= number; i++) {
				product = 1;
				for (int n = i; n < 2 * i ; n++) {
					product *= n;
				}
				product *= (2*i);
				sum += product;		
			}
			System.out.println(sum);
		}
		else {
			System.out.println("¬и ввели не ц≥ле число!");
		}
	}
}
