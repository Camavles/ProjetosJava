
package Classes;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
      // é aqui onde eu solicito as infos do user;
      
            
            Scanner leitor = new Scanner(System.in);

            Pessoa objetoPessoa = new Pessoa();

            System.out.println("Digite o seu peso");
            objetoPessoa.setPeso(leitor.nextFloat());
            System.out.println("Digite a sua altura");
            objetoPessoa.setAltura(leitor.nextFloat());

            System.out.println("Seu imc é: " + objetoPessoa.calcularIMC());
        
    }
}
