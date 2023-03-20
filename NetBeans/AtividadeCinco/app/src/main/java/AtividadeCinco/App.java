
package AtividadeCinco;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        
        // total de vendas é em dinheiro
        // comissão é + 0.15 em cima do valor 
        
        
        Scanner leitorScanner = new Scanner(System.in);
        
       String nomeVendedor;
       double salarioFixo;
       double totalVendas; 
       double comissao;
       double salarioFinal;
       
       System.out.println("Digite seu nome ");
       nomeVendedor = leitorScanner.next();
       
       System.out.println("Digite o seu salario fixo");
       salarioFixo = leitorScanner.nextDouble();
       
       System.out.println("Digite o total de Vendas");
       totalVendas = leitorScanner.nextDouble();
       
       
       comissao = totalVendas * 0.15;
       
       salarioFinal = salarioFixo + comissao;
       
       System.out.println("Seu salario vai ser: " + salarioFinal);
       
       // parei na atividade 3 
    }
}
