
package UsandoSwitchCase.exercicios;

import java.util.Scanner;

/** Lista 2
 *  Questao 19
 * @author VAIO
 */

public class OperacoesComDoisNumeros {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int num = scan.nextInt();
        
        System.out.println("Digite outro numero: ");
        int num2 = scan.nextInt();
        
        System.out.println("Digite o sinal da operação desejada: ");
        String sinal = scan.next();
        
        float operacao = 0;
        
        switch (sinal){
            
            case "+":
                
                operacao = num + num2;
                System.out.println("A soma é: "+ operacao);
                break;
            
            case "-":
                
                operacao = num - num2;
                System.out.println("A subtração é: " + operacao);
                break;
                
            case "*":
                
                operacao = num * num2;
                System.out.println("A multiplicação é: " + operacao);
                break;
                
            case "/":
                
                operacao = num / num2;
                System.out.println("A divisão é: " + operacao);
                break;
                
            default:
                System.out.println("Sinal de operação invalido!");
        }
        
        if(operacao % 2 == 0 ){
            System.out.println(operacao + " é par!");
        }else{
            System.out.println(operacao + " é impar!");
        }
        
        if(operacao > 0){
            System.out.println(operacao + " é positivo!");
        }else{
            System.out.println(operacao + " é negativo!");
        }
        
    }
    
}
