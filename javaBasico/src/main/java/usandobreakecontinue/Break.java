
package usandobreakecontinue;

import java.util.Scanner;

/**
 *
 * @author VAIO
 */
public class Break {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
       
        
        System.out.println("Digite um numero: ");
        int num = scan.nextInt();
         
        System.out.println("Digite um limite: ");
        int max = scan.nextInt();
        
        for(int i = num; i<= max; i++){
            System.out.println(i);
            if(i % 7 == 0){
                System.out.println("O valor de i é: " + i);
                break;
            }
        }
    }
    
}
