
package array.exercicios;

import java.util.Scanner;

/** Lista 4
 *  Questao 10
 * @author VAIO
 */
public class Q11_ParesDeUmVetor {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[] numeros = new int[10];
        int[] pares = new int[10];
        for(int i =0; i<10;i++){
            System.out.printf("Digite o %d º numero: \n",i+1);
            numeros[i]= scan.nextInt();
            
        }
        System.out.println("São pares os numeros: ");
        
        for(int i = 0; i< 10; i++){
            if(numeros[i] % 2 == 0){
                pares[i] = numeros[i]; 
            }
                
        }
        
        for(int i = 0; i <10; i++){
            System.out.print(pares[i] +", ");
        }
        System.out.println("\nA quantidade de numeros pares digitados é: "+
                (pares.length));
    }
    
}
