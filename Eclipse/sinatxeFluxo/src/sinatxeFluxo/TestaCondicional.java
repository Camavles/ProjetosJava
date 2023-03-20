package sinatxeFluxo;

public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		
		int idade = 16;
		int qtdPessoas = 3;
		
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos");
		} else if (qtdPessoas >= 2) {
			System.out.println("Já que está acompanhado, pode entrarr");
		} else {
			System.out.println("Vc não tem mais de 18");
		}
	}
}
