
package usandobreakecontinue;

import java.util.Scanner;

/**
 *
 * @author VAIO
 */
public class Continue {

    
    public static void main(String[] args) {
        
         Scanner scan = new Scanner(System.in);
       
        
        System.out.println("Digite um numero: ");
        int num = scan.nextInt();
         
        System.out.println("Digite um limite: ");
        int max = scan.nextInt();
        
        for(int i = num; i<= max; i++){
            
            if(i % 7 == 0){
                continue; //nao imprime os divisiveis por 7 e vai para a proxima
                            //interacao
            }
            System.out.println("O valor de i é: " + i);
           
        }
    }
    
}
