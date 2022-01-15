
package UsandoSwitchCase.exercicios;

import java.util.Scanner;

/** Lista 2
 * Questao 13
 * @author VAIO
 */
public class QualEhODiaDaSemana {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int num = scan.nextInt();
        
        switch(num){
            case 1:
                System.out.println("É domingo!");
                break;
                
            case 2:
                System.out.println("É segunda!");
                break;
                
            case 3:
                System.out.println("É terça!");
                break;
                
            case 4:
                System.out.println("É quarta!");
                break;
                
            case 5:
                System.out.println("É quinta!");
                break;
                
            case 6:
                System.out.println("É sexta!");
                break;
            
            case 7:
                System.out.println("É sabado!");
                break;
                
            default:
                System.out.println("Numero invalido!");
        }
        
    }
    
}
