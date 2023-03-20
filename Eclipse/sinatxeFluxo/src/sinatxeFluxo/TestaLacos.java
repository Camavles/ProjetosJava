package sinatxeFluxo;

public class TestaLacos {
	public static void main(String[] args) {
		
		int i;
		int j;
		for (i = 0; i <= 10; i++) {
			for (j = 1; j <= 10; j++) {
				System.out.print(i * j);
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}
}
