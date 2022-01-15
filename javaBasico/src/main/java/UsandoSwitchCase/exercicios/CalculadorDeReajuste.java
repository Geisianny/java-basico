 
package UsandoSwitchCase.exercicios;

import java.util.Scanner;

/**Lista 2
 * Questao 11
 * @author VAIO
 */
public class CalculadorDeReajuste {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o salario: ");
        float salario = scan.nextFloat();
        
        float aumento = 0;
        
        if(salario <= 280){
            aumento = 20;
        }else if(salario > 280 && salario <= 700){
            aumento = 15;
        }else if(salario > 700 && salario <= 1500){
            aumento =  10;   
        }else if (salario > 1500){
            aumento =  5;
        }
        
        System.out.println("O salario antes do reajuste: " + salario);
        System.out.println("Percentual de aumento aplicado: " + aumento+"%");
        System.out.println("Valor do aumento: " + salario*aumento/100);
        System.out.println("Novo salario, após o aumento: "+ ((salario*aumento/100)
        + salario));
    }
    
}
