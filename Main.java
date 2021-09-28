import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		System.out.print("Введіть ціле число: ");
		if(sc.hasNextInt()) {
			i=sc.nextInt();
			if (i%2==0) {
				System.out.println("Парне!");
			}
			else {
				System.out.println("Непарне!");
			}
		}
		else {
			System.out.println("Ви ввели не ціле число!");
		}
	}

}