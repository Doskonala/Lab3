import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String word;
        System.out.print("Введіть слово з 5 букв: ");
        word = sc.nextLine();
        if (word.length() == 5) {
        	for (int i = 0; i < 5; i++) {
        		if(!Character.isLetter(word.charAt(i))) {
        			System.out.print("Треба було ввести слово з 5 букв!");
        			return;
        		}
        	}
        String reverse = "";
        for (int i = 0; i < 5; i++) {
        	reverse = word.charAt(i) + reverse;
        }
        if (word.equalsIgnoreCase(reverse)) {
        	System.out.println("Паліндром.");
        }
        else {
        	System.out.println("Не паліндром.");
        }
        }
        else {
        	System.out.print("Треба було ввести слово з 5 букв!");
        }
	}

}
