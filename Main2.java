import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String word;
        System.out.print("������ ����� � 5 ����: ");
        word = sc.nextLine();
        if (word.length() == 5) {
        	for (int i = 0; i < 5; i++) {
        		if(!Character.isLetter(word.charAt(i))) {
        			System.out.print("����� ���� ������ ����� � 5 ����!");
        			return;
        		}
        	}
        String reverse = "";
        for (int i = 0; i < 5; i++) {
        	reverse = word.charAt(i) + reverse;
        }
        if (word.equalsIgnoreCase(reverse)) {
        	System.out.println("��������.");
        }
        else {
        	System.out.println("�� ��������.");
        }
        }
        else {
        	System.out.print("����� ���� ������ ����� � 5 ����!");
        }
	}

}
