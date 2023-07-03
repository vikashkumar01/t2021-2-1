import java.util.Scanner;

public class Problem_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Input:");
		int num = sc.nextInt();
		
		int series = 1;
		
		for(int i=1;i<=num;i++) {
			
			System.out.print(series+" ");
			series = series + 2;
			
		}

	}

}