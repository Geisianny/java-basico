
package array.exercicios;

import java.util.Scanner;

/** Lista 4
 * Questao 32
 * @author VAIO
 */
public class Q32_TabuadaDeUmVetor {

    
    public static void main(String[] args) {
        
       Scanner scan = new Scanner(System.in);
       
       int[] numeros = new int[6];
       
       
       for(int i =0; i<6; i++){
           System.out.println("Digite o elemento da posicao "+i);
           numeros[i] = scan.nextInt();
       }
       
       for(int i=0;i<6;i++){
           for(int j=0;j<=10;j++){
               System.out.printf("%d X %d = %d\n",i,j,(i*j));
           }
           System.out.println();
       }
    }
    
}
