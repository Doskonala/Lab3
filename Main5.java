import java.util.Scanner;
public class Main5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("¬вед≥ть к≥льк≥сть простих чисел: ");
		if(sc.hasNextInt()) {
			int quantity = sc.nextInt();
			for (int i = 0, j = 0; i < quantity; j++) {
				if((j>1)&&(j<4)){
		            i++;
		            System.out.println(j);
		        }
		        if(((j>3)&&(j<8))&&((j%2!=0)&&(j%3!=0))){
		        	i++;
		            System.out.println(j);
		        }
		        if(j>7&&((j*j-1)%24==0)&&((j%5!=0)&&(j%7!=0))){
		        	i++;
		            System.out.println(j);
		        }
			}
		}
		else {
			System.out.println("¬и ввели не ц≥ле число!");
		}
	}

}
