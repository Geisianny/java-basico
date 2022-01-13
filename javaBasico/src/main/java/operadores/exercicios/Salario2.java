 
package operadores.exercicios;

import java.util.Scanner;

/**
 * Questão 13
 * @author VAIO
 */
public class Salario2 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor recebido por hora: ");
        float valor = scan.nextFloat();
        
        System.out.println("Digite o numero de horas trabalhadas: ");
        int horasTrabalhadas = scan.nextInt();
        
        double salario = 0;
        
        salario = (valor*horasTrabalhadas);
        
        double total = salario - (salario*11/100) 
                - (salario*8/100) - (salario*5/100);
        
        System.out.println("O valor bruto: " + salario);
        System.out.println("Valor do INSS: " + (salario*8/100));
        System.out.println("Valor do sindicato: " + (salario*5/100));
        System.out.println("Valor do imposto de Renda: " + (salario*11/100));
        System.out.println("Salario liquido: "+ total);
        
    }
    
}
