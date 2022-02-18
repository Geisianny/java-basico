
package array.exercicios;

import java.util.Scanner;

/** Lista 4
 *  Questao 22
 * @author VAIO
 */
public class Q22_ElementosAleatoriosDeUmVetor {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[] numeros = new int[10];
        int cont1 = 0;
        int cont0 = 0;
        
        for(int i = 0; i< 10; i++){
            numeros[i] = (int)Math.round(Math.random()*1);
        
            if(numeros[i] == 1){
                cont1++;
            }else if(numeros[i] == 0){
                cont0++;
            }
        }
        
        System.out.println("Percentual de 1: " + (cont1*100)/numeros.length);
        System.out.println("Percentual de 0: " + (cont0*100)/numeros.length);
    }
    
}
