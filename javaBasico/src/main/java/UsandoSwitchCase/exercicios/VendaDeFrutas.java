
package UsandoSwitchCase.exercicios;

import java.util.Scanner;

/** Lista 2
 * Questao 22
 * @author VAIO
 */
public class VendaDeFrutas {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite os kgs de maça e morango: ");
        float maca = scan.nextFloat();
        float morango = scan.nextFloat();
        
        double totalMorango = 0;
        double totalMaca = 0;
        
        if(morango <= 5){
            
            totalMorango = 2.50* morango;
        
        }else if(morango > 5){
            
            totalMorango = 2.20 * morango;
        }
        
        if(maca <= 5){
            
            totalMaca = 1.80 * maca;
            
        }else if(maca > 5){
            
            totalMaca = 1.50 * maca;
        }
        
        if( morango >= 8  || totalMorango >= 25 ){
            totalMorango = totalMorango - (totalMorango*10)/100;
        }
        
        if(maca >= 8 || totalMaca >= 25){
            totalMaca = totalMaca - (totalMaca*10)/100;
        }
        
        System.out.println("O pagamento total da maça é: " + totalMaca);
        System.out.println("O pagamento total do morango é: " + totalMorango);
    }
    
}
