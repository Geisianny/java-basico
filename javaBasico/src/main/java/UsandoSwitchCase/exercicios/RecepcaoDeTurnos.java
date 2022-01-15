
package UsandoSwitchCase.exercicios;

import java.util.Scanner;

/** Lista 2
 * Questao 10
 * @author VAIO
 */
public class RecepcaoDeTurnos {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite seu turno: (M-Matutino, "
                + "V-Vespertino ou N-Noturno)");
        
        String turno = scan.nextLine();
        
        switch(turno){
            
            case "M":
                System.out.println("Bom dia!");
                break;
            
            case "V":
               System.out.println("Boa tarde!");
                break; 
                
            case "N":
                System.out.println("Boa noite!");
                break;
                
            default:
                System.out.println("Opcao invalida!");
        }
    }
    
}
