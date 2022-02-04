
package loops.exercicios;

import java.util.Scanner;

/** Lista 03
 *  Questao 28
 * @author VAIO
 */
public class Q28_EhPrimoOuNao {

   
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int num = scan.nextInt();
        
        int contPar = 0;
        
        
        for( int i=1;i<num+1;i++){
            if(num % i == 0){
                contPar++;
            }
        }
        if(contPar == 2){
            System.out.println("O numero " + num + " é primo");
        }else{
            System.out.println("O numero " + num + " não é primo");
        }
    }
    
}
