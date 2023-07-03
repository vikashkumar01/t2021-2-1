import java.util.Scanner;

public class Problem_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Input:");
		int num = sc.nextInt();
		
		int series = 1;
		
		if(num%2==0) {
			
			for(int i=1;i<=num-1;i++) {
				
				System.out.print(series+" ");
				series = series + 2;
				
			}
			
		}else {
			
			for(int i=1;i<=num;i++) {
				
				System.out.print(series+" ");
				series = series + 2;
				
			}
			
		}
	

	}

}