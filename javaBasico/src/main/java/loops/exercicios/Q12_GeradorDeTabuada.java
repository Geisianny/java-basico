 
package loops.exercicios;

import java.util.Scanner;

/** Lista 3
 * Questao 12
 * @author VAIO
 */
public class Q12_GeradorDeTabuada {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero de 1 a 10: ");
        int num = scan.nextInt();
        
        System.out.printf("Tabuada de %d: \n\n", num );
        for(int i = 0; i < 11; i++ ){
            System.out.printf(" %d x %2d = %2d \n",num,i,(num*i));
        }
    }
    
}
