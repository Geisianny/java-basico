
package loops.exercicios;

import java.util.Scanner;

/** Lista 03
 *  Questao 30
 * @author VAIO
 */
public class Q30_TabuadaComIntervalo {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int num = scan.nextInt();
        
        System.out.print("Começar por: \n");
        int comeco = scan.nextInt();
        
        System.out.println("Terminar em: ");
        int fim = scan.nextInt();
        
        if(comeco < fim){
            System.out.printf("Vou montar a tabuada de %d começando em %d e "
                + "teerminando em %d: \n",num,comeco,fim);
        
            for(int i = comeco; i<=fim;i++){
                System.out.printf("%d X %d = %d\n",num,i,(num*i));
            }
        }else{
            System.out.println("ERRO! o fim não pode ser menor que o começo.");
        }
    }
    
}
