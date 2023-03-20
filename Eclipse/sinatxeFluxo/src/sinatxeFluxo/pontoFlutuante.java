package sinatxeFluxo;

public class pontoFlutuante {
	public static void main(String[] args) {
		double salario;
		salario = 1250.70;
		System.out.println("Meu salário é: " + salario);
		
		double divisao = 3.14 / 2;
		System.out.println(divisao); // resultado é 1.57
		
		int outraDivisao = 5 / 2;
		System.out.println(outraDivisao); // resultado dá 2;
		/* Para o java uma divisão de números inteiros que dá um número inexato, ele força o resultado para um número inteiro */
		
		double novaTentativa = 5.0 / 2;
		System.out.println(novaTentativa); 
		
		/* resultado vai ser 2.5; se eu não colocar o 5 como ponto flutuante, ele vai forçar o resultado para 2.0;*/
		
	}
}
