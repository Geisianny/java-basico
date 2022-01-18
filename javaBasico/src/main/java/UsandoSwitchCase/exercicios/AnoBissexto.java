
package UsandoSwitchCase.exercicios;

import java.util.Scanner;

/** Lista 2
 *  Questao 17
 * @author VAIO
 */

//Ano bissexto: se ele for divisível por 400 ou se ele for
// divisivel por 4 e não por 100
public class AnoBissexto {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um ano: ");
        int ano = scan.nextInt();
        
        if((ano % 400 == 0) || (ano % 4 == 0) && (ano % 100 != 0)){
            System.out.printf(" %d é bissexto!\n",ano);
        }else{
            System.out.printf(" %d não é bissexto!\n ", ano);
        }
        
    }
    
}
