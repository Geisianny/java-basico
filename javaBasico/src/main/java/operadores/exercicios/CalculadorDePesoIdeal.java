
package operadores.exercicios;

import java.util.Scanner;

/**
 * Questão 12
 * @author VAIO
 */
public class CalculadorDePesoIdeal {

    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a sua altura: ");
        float altura = scan.nextFloat();
        
        double pesoIdeal = (72.7*altura) - 58;
        
        System.out.println("O seu peso ideal é: "+ pesoIdeal);
        
    }
    
}
