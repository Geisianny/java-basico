 
package UsandoSwitchCase.exercicios;

import java.util.Scanner;

/** Lista 2
 * Questao 20
 * @author VAIO
 */
public class PerguntasDoInterrogatorio {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Responda as pergunta com S ou N.");
        
        System.out.println("1- Telefonou para a vitima? ");
        String pergunta1 = scan.nextLine();
        
        System.out.println("2- Esteve no local do crime? ");
        String pergunta2 = scan.nextLine();
        
        System.out.println("3- Mora perto da vitima? ");
        String pergunta3 = scan.nextLine();
        
        System.out.println("4- Devia para a vitima? ");
        String pergunta4 = scan.nextLine();
        
        System.out.println("5- Ja trabalhou com a vitima? ");
        String pergunta5 = scan.nextLine();
        
        int cont = 0;
        
        if(pergunta1.equalsIgnoreCase("S")){
            cont++;
        }
        if(pergunta2.equalsIgnoreCase("S")){
            cont++;
        }
        if(pergunta3.equalsIgnoreCase("S")){
            cont++;
        }
        if(pergunta4.equalsIgnoreCase("S")){
            cont++;
        }
        if(pergunta5.equalsIgnoreCase("S")){
            cont++;
        }
        
        if(cont == 2){
            System.out.println("Pessoa suspeita.");
        }else if(cont == 3 || cont == 4){
            System.out.println("Pessoa Cumplice.");
        }else if(cont == 5){
            System.out.println("Pessoa assassina.");
        }else if(cont == 0){
            System.out.println("Pessoa inocente.");
        }
    }
    
}
