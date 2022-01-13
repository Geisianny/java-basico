
package operadores.exercicios;

import java.util.Scanner;

/**Questão 3
 *
 * @author VAIO
 */
public class SomaDeDoisNumeros {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int num = scan.nextInt();
        
        System.out.println("Digite outro numero: ");
        int num2 = scan.nextInt();
        
        System.out.println("A soma dos dois numeros é : " +(num + num2));
    }
    
}
