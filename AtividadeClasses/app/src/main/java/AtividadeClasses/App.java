
package AtividadeClasses;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        // vai criar um objeto para ser gerenciado pela classe
        Pessoa objetoPessoa = new Pessoa();
        
        
        System.out.println("Digite seu peso");
        objetoPessoa.setPeso(leitor.nextFloat());
        
        System.out.println("Digite sua altura");
        objetoPessoa.setAltura(leitor.nextFloat());
        
        
        System.out.println("IMC " + objetoPessoa.calcularIMC());
    }
}
