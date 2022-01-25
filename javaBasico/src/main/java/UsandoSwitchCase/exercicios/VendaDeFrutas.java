
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
        float qtdMaca = scan.nextFloat();
        float qtdMorango = scan.nextFloat();
        
        double precoKgMorango = 0;
        if (qtdMorango <= 5){
           precoKgMorango =  2.5;
        } else {
            precoKgMorango =  2.2;
        }

        double precoKgMaca = 0;
        if (qtdMaca <= 5){
            precoKgMaca = 1.8;
        } else {
            precoKgMaca = 1.5;
        }

        double precoTotalMorango = qtdMorango * precoKgMorango;
        double precoTotalMaca = qtdMaca * precoKgMaca;

         double precoParcial = precoTotalMorango + precoTotalMaca;
        double precoTotal = precoParcial;

        if ((qtdMorango + qtdMaca > 8) || precoParcial > 25){
            precoTotal = precoParcial - ((precoParcial / 100) * 10);
        }

        System.out.println("Preco total = " + precoTotal);
    }
    
}
