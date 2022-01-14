
package UsandoSwitchCase.exercicios;

import java.util.Scanner;

/** Lista 2
 * Questao 5
 * @author VAIO
 */
public class NotasDeUmAluno {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        float nota1 = scan.nextFloat();
        
        System.out.println("Digite a segunda nota: ");
        float nota2 = scan.nextFloat();
        
        float media = (nota1 + nota2)/2;
        
        
        if(media == 10){
            System.out.println("Aprovado com Distinção!");
        }else if(media < 7 ){
            System.out.println("Reprovado!");
        }else {
            System.out.println("Aprovado!");
            
        }
    }
    
}
