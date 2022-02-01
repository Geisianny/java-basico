
package loops.exercicios;

import java.util.Scanner;

/** Lista 03
 * Questao 19
 * @author VAIO
 */
public class Q19_MediaAritmeticaDeNnotas {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o numero de notas: ");
        int quantNotas = scan.nextInt();
        
        float soma = 0;
        float media = 0;
        
        System.out.println("Digite as notas: ");
        for(int i = 0; i < quantNotas; i++){
            
            float nota = scan.nextFloat();
            soma += nota;
        }
        
        media = soma/quantNotas;
        
        System.out.println("A soma das notas é: " + soma);
        System.out.println("A media Aritmetica das notas é: " + media);
        
    }
    
}
