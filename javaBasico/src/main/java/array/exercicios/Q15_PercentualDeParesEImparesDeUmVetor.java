
package array.exercicios;

import java.util.Scanner;

/** Lista 4
 *  Questao 15
 * @author VAIO
 */
public class Q15_PercentualDeParesEImparesDeUmVetor {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[10];
        int contPar = 0;
        int contImpar = 0;
        
        for(int i = 0; i<10; i++){
            System.out.printf("Digite o %dº elemento:\n",(i+1));
            numeros[i] = scan.nextInt();
            
            if(numeros[i] % 2 == 0){
                contPar++;
            }else{
                contImpar++;
            }
               
        }
        System.out.println("Quantidade de impares: "+contImpar);
        System.out.println("Quantidade de pares: " + contPar);
        
    }
    
}
