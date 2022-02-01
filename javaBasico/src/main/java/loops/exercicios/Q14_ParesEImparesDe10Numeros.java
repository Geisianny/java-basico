
package loops.exercicios;

import java.util.Scanner;

/** Lista 3
 * Questao 13
 * @author VAIO
 */
public class Q14_ParesEImparesDe10Numeros {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite 10 numeros: ");
        
        int contImpar = 0;
        int contPar = 0;
        
        for(int i = 0; i < 10; i++){
            
            int num = scan.nextInt();
            
            if(num % 2 == 0){
                contPar++;
            }else{
                contImpar++;
            }
        }
        
        System.out.println("Quantidade de numeros pares: "+contPar);
        System.out.println("Quantidade de numeros impares: "+contImpar);
    }
    
}
