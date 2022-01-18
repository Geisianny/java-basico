
package UsandoSwitchCase.exercicios;

import java.util.Scanner;

/** Lista 2
 * Questao 21
 * @author VAIO
 */
public class VendasDeCombustiveis {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite (A) para Alcool, (G) para Gasolina: ");
        String combustivel = scan.next();
        
        System.out.println("Digite a quantidade de litros comprados: ");
        int litros = scan.nextInt();
        
        double pagamento = 0;
        
        if(combustivel.equalsIgnoreCase("A")){
            if(litros <= 20){
                pagamento = (litros * 1.90) - (3 * litros * 1.90)/ 100;
            }else if( litros > 20){
                pagamento = (litros * 1.90) - (5 * litros * 1.90) / 100;
            }
        }else if (combustivel.equalsIgnoreCase("G")){
            if(litros <= 20){
                pagamento = (litros * 2.50) - (4 * litros * 2.50)/ 100;
            }else if( litros > 20){
                pagamento = (litros * 2.50) - (6 * litros * 2.50) / 100;
            
            }
        }
        
        
        System.out.println("O total de pagamento é: " + pagamento);
    }
    
    
}
