
package While;


import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        
        int totalAlunos = 5;
        
        Scanner leitorScanner = new Scanner(System.in);
        
        
        while (totalAlunos > 0) {
            String nomeAluno = leitorScanner.nextLine();
            int idadeAluno = leitorScanner.nextInt();

            System.out.println("Nome aluno é " + nomeAluno + "idade aluno é: "
                    + idadeAluno);
            
            totalAlunos = totalAlunos - 1;
        }
        
    }
}
