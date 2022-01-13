
package operadores.exercicios;

import java.util.Scanner;

/**
 * Questão 6
 * @author VAIO
 */
public class AreaDeUmCirculo {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o raio do circulo: ");
        float raioCirculo = scan.nextFloat();
        
        double area = 0.0;
        
        area = 3.14 * (raioCirculo * raioCirculo);
        
        System.out.println("O valor da area do circulo é: " + area);
    }
    
}
