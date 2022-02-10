
package array.exercicios;

import java.util.Scanner;

/** Lista 4
 *  Questao 14
 * @author VAIO
 */
public class Q14_MediaAritmeticaDosNumerosImparesDeUmVetor {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[10];
        
        float media = 0;
        int cont = 0;
        
        for(int i = 0; i< 10; i++){
            System.out.printf("Digite o %d º: \n",(i+1));
            numeros[i] = scan.nextInt();
            
            if(numeros[i] % 2 != 0){
                media += numeros[i];
                cont++;
            }
        }
        
        media = media/cont;
        
        System.out.println("A media de numeros impares é: " + media);
        
    }
    
}
