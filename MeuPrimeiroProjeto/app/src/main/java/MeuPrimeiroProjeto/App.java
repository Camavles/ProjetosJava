
package MeuPrimeiroProjeto;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        /*
        minha linha de comentários em bloco
        */
        // linha de comentário em linha
        //System.out.println("Camila"); --> bota o cursor na próxima linha
        // System.out.print("Camila"); --> deixa o cursor no final da linha
        
        Scanner leitor = new Scanner(System.in);
    }
    
    int idade = leitor.nextInt();
    float cotacao = leitor.nextFloat();
    // nextLine lê uma palavra
    String nome = leitor.nextLine();
    // next lê uma frase inteira até a pessoa apertar o enter
    String codigoRua = leitor.next();
    
    
}
