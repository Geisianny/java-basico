 
package UsandoSwitchCase.exercicios;

import java.util.Scanner;

/** Lista 2
 * Questao 4
 * @author VAIO
 */
public class VogalOuConsoante {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite uma letra: ");
        String letra = scan.nextLine();
        
        if(letra.length() > 1){ // Para verifica o tamanho de caracteres
            //foram  digitados:
            System.out.println("Não é uma letra válida!");
        }else{
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

                case "A":
                    System.out.println("É vogal!");
                    break;

                case "E":
                    System.out.println("É vogal!");
                    break;

                case "I":
                    System.out.println("É vogal!");
                    break; 

                case "O":
                    System.out.println("É vogal!");
                    break;

                case "U":
                    System.out.println("É vogal!");
                    break;

                default:
                    System.out.println("É consoante!");
            }
        }    
    }
    
}
