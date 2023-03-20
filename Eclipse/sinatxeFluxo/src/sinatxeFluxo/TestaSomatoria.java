package sinatxeFluxo;

public class TestaSomatoria {
	public static void main(String[] args) {
		int contador = 0;
		int total = 0;
		
		
		while(contador <= 10) {
		// total += contador; isso é a mesma coisa que a linha debaixo
		total = total + contador;
		
		System.out.println(total);
		contador++;
		}
	}
}
