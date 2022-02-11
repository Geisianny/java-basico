
package array.exercicios;

import java.util.Scanner;

/** Lista 4
 * Questao 20
 * @author VAIO
 */
public class Q20_CotacaoDoDolar {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double[] vetorA = new double[20];
        
        System.out.println("Digite a cotação do dolar: ");
        double cotacao = scan.nextDouble();
        
        for(int i =0; i<vetorA.length;i++){
            vetorA[i] = cotacao*(i+1);
        }
        
        System.out.println("Vetor A: ");
        for(int i = 0; i<20;i++){
            System.out.print(vetorA[i]+", ");
        }
        
        
        
    }
    
}
