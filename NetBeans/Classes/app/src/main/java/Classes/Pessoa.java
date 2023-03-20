/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;


public class Pessoa {
    // a classe precisa representar uma entidade;
    
    // atributos/propriedades
   private float peso;
   private float altura; 
    
    public float calcularIMC() {
        float imc = peso / (altura * altura);
        return imc;
    }
    
    public void setPeso(float peso) {
        // dentro do set eu faço validações
        this.peso = peso;
    }
    
    public float getPeso() {
        // no get eu pego direto com o usuário a info; não acesso ela diretamente
        return peso;
    } 
    
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float getAltura(){
        return altura;
    }
}
