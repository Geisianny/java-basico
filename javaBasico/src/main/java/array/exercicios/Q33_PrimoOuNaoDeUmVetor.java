
package array.exercicios;

import java.util.Scanner;

/** Lista 4
 *  Questao 33
 * @author VAIO
 */
public class Q33_PrimoOuNaoDeUmVetor {
        
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[] numeros = new int[10];
        
        for(int i = 0; i< 10; i++){
            System.out.println("Digite o elemento da posicao " + i);
            numeros[i] = scan.nextInt();
        }
        
        boolean primo;
        
        for(int i = 0; i<10;i++){
            
            primo = true;
            for(int j = 2; j<numeros[i];j++){
                if(numeros[i] % j == 0){
                    primo = false;
                    break;
                }
            }
            if(primo){
                System.out.println( numeros[i]+" é primo!");
            }else{
                System.out.println(numeros[i]+" não é primo!");
                }
            
        }
    }
    
}
