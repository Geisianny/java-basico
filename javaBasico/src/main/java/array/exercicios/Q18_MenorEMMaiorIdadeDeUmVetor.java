
package array.exercicios;

import java.util.Scanner;

/** Lista 4
 * Questao 18
 * @author VAIO
 */
public class Q18_MenorEMMaiorIdadeDeUmVetor {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[] idades = new int[10];
        
        for(int i = 0; i<10; i++){
            System.out.printf("Digite a %d º idade:\n",(i+1));
            idades[i] = scan.nextInt();
        }
        int menorIdade = Integer.MAX_VALUE;
        int maiorIdade = Integer.MIN_VALUE;
        
        for(int i =0; i<10;i++){
            if(idades[i] > maiorIdade){
                maiorIdade = idades[i];
            }else if(idades[i]< menorIdade){
                menorIdade = idades[i];
            }
        }
        
        System.out.println("A maior idade é: " + maiorIdade);
        System.out.println("A menor idade é: " + menorIdade);
    }
    
}
