
package loops.exercicios;

import java.util.Scanner;

/**Lista 3
 * Questao 4
 * @author VAIO
 */
public class Q4_CrescimentoPopulacional {

    public static void main(String[] args) {
        
        
        int popA = 80000;
        int popB = 200000;
        int anos = 0;
        
        while(popA< popB ){
            popA += (popA/100) *3;
            popB += (popB/100) * 1.5;
            anos++;
        }
        
        System.out.println("População A: "+popA);
        System.out.println("População B: " + popB);
        System.out.println("Quantidade de anos: " + anos);
    }
    
}
