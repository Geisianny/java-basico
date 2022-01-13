 
package operadores.exercicios;

import java.util.Scanner;

/**
 * Questão 7
 * @author VAIO
 */
public class AreaQuadrado {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor de um lado do quadrado: ");
        float lado = scan.nextFloat();
        
        float area = 0;
        
        area = lado * lado;
        
        System.out.println("A area do quadrado é: "+ area);
        System.out.println("O dobro da area é: " + (area*2));
    }
    
}
