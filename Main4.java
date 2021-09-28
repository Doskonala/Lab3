import java.util.Scanner;
public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введіть ціле число: ");
		if(sc.hasNextInt()) {
			int number = sc.nextInt();
			System.out.print("Введіть цифру, яку треба видалити: ");
			if(sc.hasNextInt()) {
				int digit = sc.nextInt();
				String text = String.valueOf(number);
				String sub = String.valueOf(digit);
				String changedText = text.replaceAll(sub,"");
				number = Integer.parseInt(changedText);
				System.out.println(number);
			}
			else {
				System.out.println("Ви ввели не цифру!");
				return;
			}
		}
		else {
			System.out.println("Ви ввели не ціле число!");
		}
	}

}
