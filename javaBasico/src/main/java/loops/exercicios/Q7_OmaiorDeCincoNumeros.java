
package loops.exercicios;

import java.util.Scanner;

/** Lista 3
 * Questao 7
 * @author VAIO
 */
public class Q7_OmaiorDeCincoNumeros {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int numero = 0;
        int maior = Integer.MIN_VALUE; //Menor valor possivel
        
        System.out.println("Digite 5 numeros: ");
        for(int i = 0; i < 5; i++){
            
            numero = scan.nextInt();
            
            if(numero > maior){
                maior = numero;
            }
        }
        
        System.out.println("O maior dos numeros digitados é: "+maior);
    }
    
}
