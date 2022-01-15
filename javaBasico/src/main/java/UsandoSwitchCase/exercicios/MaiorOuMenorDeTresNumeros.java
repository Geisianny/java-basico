
package UsandoSwitchCase.exercicios;

import java.util.Scanner;

/** Lista 2
 * Questao 7
 * @author VAIO
 */
public class MaiorOuMenorDeTresNumeros {

    public static void main(String[] args) {
       
         Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int num = scan.nextInt();
        
        System.out.println("Digite outro numero: ");
        int num2 = scan.nextInt();
        
        System.out.println("Digite o terceiro numero: ");
        int num3 = scan.nextInt();
        
        int maior = 0;
        int menor = 0;
        
        if(num > num2 && num > num3){
            maior = num;
        }else if(num2 > num && num2 > num3){
            maior = num2;
        }else{
            maior = num3;
        }
        
        if(num < num2 && num < num3){
            menor = num;
        }else if(num2 < num && num2 < num3){
            menor = num2;
        }else{
            menor = num3;
        }
        
        System.out.println("O maior numero entre " + num + ", " +
                  num2 + ", " + num3 + " é: " + maior );
        
        System.out.println("O menor numero entre " + num + ", " +
                  num2 + ", " + num3 + " é: " + menor );
    }
    
}
