import java.util.Scanner;
public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���� �����: ");
		if(sc.hasNextInt()) {
			int number = sc.nextInt();
			System.out.print("������ �����, ��� ����� ��������: ");
			if(sc.hasNextInt()) {
				int digit = sc.nextInt();
				String text = String.valueOf(number);
				String sub = String.valueOf(digit);
				String changedText = text.replaceAll(sub,"");
				number = Integer.parseInt(changedText);
				System.out.println(number);
			}
			else {
				System.out.println("�� ����� �� �����!");
				return;
			}
		}
		else {
			System.out.println("�� ����� �� ���� �����!");
		}
	}

}
