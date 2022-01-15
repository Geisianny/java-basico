
package UsandoSwitchCase.exercicios;

import java.util.Scanner;

/** Lista 2
 * Questao 9
 * @author VAIO
 */
public class OrdemDecrescente {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe tres numeros: ");
        float num = scan.nextFloat();
        float num2 = scan.nextFloat();
        float num3 = scan.nextFloat();
        
        if(num > num2 && num > num3 && num2> num3){
            num = num;
            num2 = num2;
        }else if(num2 > num && num2 > num3 && num3 > num){
            num3 = num;
            num = num2;
            num2 = num3;
            
        }else{
            num = num3;
            num2 = num;
            num3 = num2;
        }
        
        System.out.printf("Os numeros em ordem decrescente é: %.2f,%.2f,%.2f.",
                num,num2,num3);
    }
    
}
