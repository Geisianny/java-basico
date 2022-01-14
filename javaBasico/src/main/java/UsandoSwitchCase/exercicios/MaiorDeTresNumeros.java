
package UsandoSwitchCase.exercicios;

import java.util.Scanner;

/** Lista 2
 * Questao 6
 * @author VAIO
 */
public class MaiorDeTresNumeros {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int num = scan.nextInt();
        
        System.out.println("Digite outro numero: ");
        int num2 = scan.nextInt();
        
        System.out.println("Digite o terceiro numero: ");
        int num3 = scan.nextInt();
        
        int maior = 0;
        
        if(num > num2 && num > num3){
            maior = num;
        }else if(num2 > num && num2 > num3){
            maior = num2;
        }else{
            maior = num3;
        }
        
        System.out.println("O maior numero entre " + num + ", " +
                  num2 + ", " + num3 + " é: " + maior );
    }
    
}
