
package MeuPrimeiroProjeto;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        /*
        minha linha de coment�rios em bloco
        */
        // linha de coment�rio em linha
        //System.out.println("Camila"); --> bota o cursor na pr�xima linha
        // System.out.print("Camila"); --> deixa o cursor no final da linha
        
        Scanner leitor = new Scanner(System.in);
    }
    
    int idade = leitor.nextInt();
    float cotacao = leitor.nextFloat();
    // nextLine l� uma palavra
    String nome = leitor.nextLine();
    // next l� uma frase inteira at� a pessoa apertar o enter
    String codigoRua = leitor.next();
    
    
}
