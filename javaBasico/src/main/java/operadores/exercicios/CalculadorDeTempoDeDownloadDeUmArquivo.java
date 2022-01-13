
package operadores.exercicios;

import java.util.Scanner;

/**
 * Questao 14
 * @author VAIO
 */
public class CalculadorDeTempoDeDownloadDeUmArquivo {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do arquivo em MB: ");
        float tamanho = scan.nextFloat();
        
        System.out.println("Digite a velocidade da internet(em Mbps): ");
        float velocidade = scan.nextFloat();
        
        float tempo = 0;
        
        tempo = tamanho * velocidade;
        System.out.println("O tempo aproximado do download do aquivo usando o "
                + "link em minutos é: "+ tempo );
    }
    
}
