
package loops.exercicios;

import java.util.Scanner;

/** Lista 3
 * Questao 5
 * @author VAIO
 */
public class Q5_CrescimentoPopulacional_Alteracao {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int popA = 0;
        int popB = 0;
        float taxaA = 0;
        float taxaB = 0;
        int anos = 0;
        
        boolean valido = false;
        
        do{
            System.out.println("Digite a populacao A: ");
            popA = scan.nextInt();
            
            System.out.println("Digite a populacao B: ");
            popB = scan.nextInt();
            
            if(popA > 0 && popB > 0){
                valido = true;
            }else{
                System.out.println("Numero de populacao invalida!");
            }   
            
        }while(!valido);
        
        valido = true;
        
        do{
            System.out.println("Digite a taxa da  populacao A: ");
            taxaA = scan.nextInt();
            
            System.out.println("Digite a taxa da populacao B: ");
            taxaB = scan.nextInt();
            
            if(taxaA > 0 && taxaB > 0){
                valido = true;
            }else{
                System.out.println("Numero de taxa da populacao invalido!");
            }
        }while(!valido);
        
        
        while(popA < popB){
            popA += (popA/100) *taxaA;
            popB += (popB/100) * taxaB;
            anos++;
        }
        
        System.out.println("População A: "+popA);
        System.out.println("População B: " + popB);
        System.out.println("Quantidade de anos: " + anos);
    }
    
}
