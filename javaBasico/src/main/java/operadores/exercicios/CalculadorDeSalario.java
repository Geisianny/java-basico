
package operadores.exercicios;

import java.util.Scanner;

/**
 * Questao 8
 * @author VAIO
 */
public class CalculadorDeSalario {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor da hora trabalhada: ");
        float valor = scan.nextFloat();
        
        System.out.println("Digite o total de horas trabalhadas: ");
        float horasTrabalhadas = scan.nextFloat();
        
        double salario = valor * horasTrabalhadas;
        
        System.out.println("O valor total do salario é: " + salario);
    }
    
}
