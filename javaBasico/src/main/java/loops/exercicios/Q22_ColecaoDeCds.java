
package loops.exercicios;

import java.util.Scanner;

/** Lista 3
 * Questao 22
 * @author VAIO
 */
public class Q22_ColecaoDeCds {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de cds: ");
        int quantCds = scan.nextInt();
        
        
        System.out.println("");
        
        float soma = 0;
        float media = 0;
        
        for(int i =1; i<=quantCds; i++){
            
            System.out.println("Digite o valor do cd " + i);
            float cd = scan.nextFloat();
            
            soma += cd;
            
        }
        
        media = soma/quantCds;
        
        System.out.println("A soma dos cd's é: " + soma);
        System.out.println("O valor medio de um cd é: " + media);
    }
    
}
