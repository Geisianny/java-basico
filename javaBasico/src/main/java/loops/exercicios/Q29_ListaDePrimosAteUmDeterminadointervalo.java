
package loops.exercicios;

import java.util.Scanner;

/** Lista 03
 *  Questao 29
 * @author VAIO
 */
public class Q29_ListaDePrimosAteUmDeterminadointervalo {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int num = scan.nextInt();
        
        boolean primo;
        
        System.out.println("Lista de numeros primos de 1 até " + num + ":");
        
        for(int i = 2; i<=num;i++){
           
            primo = true;
            
            for(int j = 2; j <i; j++ ){
                
                if(i % j == 0){
                    primo = false;
                }
            }
            
            if(primo){
                System.out.println(i);
            }
        }
        
    }
    
}
