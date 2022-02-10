
package array.exercicios;

import java.util.Scanner;

/** Lista 4
 *  Questao 17
 * @author VAIO
 */
public class Q17_IdadesMaioresQue35 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[] idades = new int[10];
        
        for(int i = 0; i < 10; i++){
            System.out.printf("Digite a %d º idade:\n", (i+1));
            idades[i] = scan.nextInt();
        }
        
        int contIdadesMaior35 = 0;
        for(int i = 0; i< 10; i++){
            if(idades[i] > 35){
                contIdadesMaior35++;
            }
        }
        
        System.out.println("Quantidade de idades maiores que 35: " + 
                contIdadesMaior35);
    }
    
}
