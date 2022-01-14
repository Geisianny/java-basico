
package UsandoSwitchCase.exercicios;

import java.util.Scanner;

/** Lista 2
 * Questao 1
 * @author VAIO
 */
public class MaiorDeDoisNumeros {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int num1 = scan.nextInt();
        
        System.out.println("Digite outro numero: ");
        int num2 = scan.nextInt();
        
        int maior = 0;
        
        if(num1 > num2){
            maior = num1;
        }else if(num2 > num1){
            maior = num2;
        }else{
            System.out.println("Os numeros são iguais.");
        }
        
        System.out.println("O maior numero entre " + num1 + " e "+ num2 + " é: "
                + "" + maior);
    }
    
}
