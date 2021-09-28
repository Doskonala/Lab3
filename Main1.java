import java.util.Scanner;
public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] array = new double[3];
		int smallest = 0;
		for (int i = 0; i < 3; i++) {
			System.out.print("¬вед≥ть дробове число: ");
			if(sc.hasNextDouble()) {
				array[i] = sc.nextDouble();
			}
			else {
				System.out.println("¬и ввели не дробове число!");
				return;
			}
		}
		for (int i = 0; i < 3; i++) {
			smallest = i;
			for(int j = 0; j < 3; j++) {
				if(Math.abs(array[j]) < Math.abs(array[smallest])) {
					smallest = j;
				}
			}
		}
		System.out.println(array[smallest]);
	}
}