package bytebank;

public class TesteReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		Conta segundaConta = primeiraConta;
		System.out.println(segundaConta.saldo);
		
		/*  com isso, eu tenho apenas uma conta, e a segunda conta 
		 * aponta para a primeira; faz apenas uma referência. 
		 * */
		
		segundaConta.saldo += 100;
		
		System.out.println(segundaConta.saldo);
		System.out.println(primeiraConta.saldo);
		
		/* neste caso a conta terá 400, pois eu tenho apenas uma conta. Tenho duas  referencias para o mesmo lugar*/
	}
}
