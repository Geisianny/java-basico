
package array.exercicios;

import java.util.Scanner;

/** Lista 4
 *  Questao 23
 * @author VAIO
 */
public class Q23_TodosOsElementosDeUmVetorDeveSerPares {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        
        int[] numeros = new int[10];
        boolean naoEhPar = false;
        System.out.println("Digite 10 valores pares:");
        
        for(int i =0; i<10;i++){
            numeros[i] = scan.nextInt();
            
            if(numeros[i] % 2 == 1){
                naoEhPar = true;
            }
            
            if(naoEhPar){
                System.out.println("Erro, esse numero nao é par!");
                break;
            }
        }
        
    }
    
    
}
