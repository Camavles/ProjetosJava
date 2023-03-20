package bytebank;

public class TesteMetodo {
	public static void main(String[] args) {
		Conta contaCamila = new Conta();
		contaCamila.saldo = 100;
		contaCamila.deposita(50);
		System.out.println(contaCamila.saldo);
		
		
		
		boolean conseguiuRetirar = contaCamila.saca(20);
		System.out.println(contaCamila.saldo);
		System.out.println(conseguiuRetirar);
		
		
		
		Conta contaRapha = new Conta();
		contaRapha.deposita(1000);
		System.out.println("Na conta do Rapha tem R$ " + contaRapha.saldo);
		
		
		// transferindo dinheiro para Camila;
		
		if(contaRapha.transfere(600, contaCamila)) {
			System.out.println("Transferencia realizada com sucesso!");
		} else {
			System.out.println("Não há dinheiro sufieciente");
		};
		
		
		System.out.println("Conta da Camila tem R$ " + contaCamila.saldo);
		System.out.println("Conta do Rapha tem R$ " + contaRapha.saldo);
	}
}
