
package array.exercicios;

import java.util.Scanner;

/** Lista 4
 *  Questao 34
 * @author VAIO
 */
public class Q34_ParesDeUmVetor {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[] numeros = new int[10];
        
        for(int i = 0; i<10;i++){
           System.out.println("Digite o elemento da posição "+i);
           numeros[i]= scan.nextInt();     
        }
        
        
        for(int i =0; i<10;i++){
            
            System.out.print("O número " + numeros[i]);
            if(numeros[i] % 2 == 0){
                System.out.print(" é par\n");
            }else{
                System.out.println();
            }
        }
        
    }
    
}
