
package loops.exercicios;

import java.util.Scanner;

/** Lista 3
 * Questao 8
 * @author VAIO
 */
public class Q8_MediaESomaDeCincoNumeros {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        
        int num = 0;
        int soma = 0;
        float media = 0;
        
        System.out.println("Digite 5 numeros: ");
        
        for(int i = 0; i < 5; i++){
            
            num = scan.nextInt();
            
            soma += num;
            
        }
        
        media = soma/5;
        
        System.out.println("A soma dos numeros é: "+ soma );
        System.out.println("A media dos numeros é: "+ media);
    }
    
}
