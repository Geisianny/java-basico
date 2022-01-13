 
package operadores.exercicios;

import java.util.Scanner;

/**
 * Questão 9
 * @author VAIO
 */
public class ConversorDeTemperaturas {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite em Fahrenheit: ");
        float fahre = scan.nextFloat();
        
        double celsius = (5 *(fahre - 32)/9);
        
        System.out.println("O valor convertido em celsius é: " + celsius);
                
    }
    
}
