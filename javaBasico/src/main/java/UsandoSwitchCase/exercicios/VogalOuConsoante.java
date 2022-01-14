 
package UsandoSwitchCase.exercicios;

import java.util.Scanner;

/** Lista 2
 * Questao 4
 * @author VAIO
 */
public class VogalOuConsoante {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite uma letra(em minuscula): ");
        String letra = scan.nextLine();
        
        switch(letra){
            
            case "a":
                System.out.println("É vogal!");
                break;
                
            case "e":
                System.out.println("É vogal!");
                break;
             
            case "i":
                System.out.println("É vogal!");
                break; 
                
            case "o":
                System.out.println("É vogal!");
                break;
                
            case "u":
                System.out.println("É vogal!");
                break;
            
            default:
                System.out.println("É consoante!");
        }
    }
    
}
