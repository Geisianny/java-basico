
package array.exercicios;

import java.util.Scanner;

/** Lista 4
 *  Questao 35
 * @author VAIO
 */
public class Q35_DivisoresDeUmVetor {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        int[] numeros = new int[10];
        
        for(int i = 0; i<10; i++){
            System.out.println("Digite o elemento da posição "+i);
            numeros[i] = scan.nextInt();
            
        }
        
        for(int i = 0;i<10;i++){
            
            System.out.print("O numero " + numeros[i]);
            
            for(int j =1; j<numeros[i];j++){
                if(numeros[i] % j == 0){
                    System.out.print(" é divisor");
                }
            }
            System.out.println();
        
        }
        
    }
    
}
