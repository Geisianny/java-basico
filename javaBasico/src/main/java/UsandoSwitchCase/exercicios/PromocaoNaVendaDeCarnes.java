
package UsandoSwitchCase.exercicios;

import java.util.Scanner;

/** Lista 2
 * Questao 23
 * @author VAIO
 */
public class PromocaoNaVendaDeCarnes {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o tipo e a quantidade de carne: ");
        String tipo = scan.nextLine();
        int quantidade = scan.nextInt();
        
        System.out.println("Tem cartão Tabajara (S/N)? ");
        String resp = scan.next();
        
        double totalCarne = 0;
        switch(tipo){
            
            case "file duplo":
                if(quantidade >= 5){
                    totalCarne = 4.90 * quantidade;
                }else{
                    totalCarne = 5.80 * quantidade;
                }
                
                break;
                
            case "alcatra":
                if(quantidade >= 5){
                    totalCarne = 5.90 * quantidade;
                }else{
                    totalCarne = 6.80 * quantidade;
                }
                break;
                
                
            case "picanha":
                if(quantidade >= 5){
                    totalCarne = 6.90 * quantidade;
                }else{
                    totalCarne = 7.80 * quantidade;
                }
                
                break;
                
            default:
                System.out.println("Opção de carne invalida!");
        }
        double desconto = 0;
        double totalCarneComDesconto = 0;
        
        if( resp.equalsIgnoreCase("S")){
            desconto = totalCarne*5/100;
            totalCarneComDesconto = totalCarne - desconto ;
        }else{
            totalCarneComDesconto = totalCarne;
        }
        
        System.out.println("----- NOTA FISCAL ----");
        System.out.println("Tipo de carne: " + tipo);
        System.out.println("Quantidade: " + quantidade);
        System.out.printf("Preco total: %.2f \n", totalCarne);
        System.out.println("Tipo de pagamento: cartão Tabajara? " + resp);
        System.out.printf("Valor do desconto: %.2f \n", desconto);
        System.out.printf("Valor a pagar: %.2f \n" ,totalCarneComDesconto);
    }
    
    
}

