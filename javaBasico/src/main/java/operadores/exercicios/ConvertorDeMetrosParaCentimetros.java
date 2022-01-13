
package operadores.exercicios;

import java.util.Scanner;

/**Questão 5
 *
 * @author VAIO
 */
public class ConvertorDeMetrosParaCentimetros {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o numero de metros: ");
        float metros = scan.nextFloat();
        
        float centimetros;
        
        centimetros = metros*100;
        
        System.out.println("O valor convertido em centimetros é: " + centimetros);
        
    }
    
}
