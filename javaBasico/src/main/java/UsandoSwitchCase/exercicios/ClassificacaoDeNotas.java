
package UsandoSwitchCase.exercicios;

import java.util.Scanner;

/** Lista 2
 * Questao 14
 * @author VAIO
 */
public class ClassificacaoDeNotas {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe as duas notas: ");
        float nota1 = scan.nextFloat();
        float nota2 = scan.nextFloat();
        
        float media = (nota1 + nota2)/2;
        char letra;
        String situacao = null;
        
        if(media >= 9){
            letra = 'A';
            situacao = "APROVADO";
        }else if(media >= 7.5 && media <= 9.0){
            letra = 'B';
            situacao = "APROVADO";
        }else if(media >= 6.0 && media <= 7.5){
            letra = 'C';
            situacao = "APROVADO";
        }else if(media >= 4.0 && media <= 6.0){
            letra = 'D';
            situacao = "REPROVADO";
        }else{
            letra = 'E';
            situacao = "REPROVADO";
        }
        
        System.out.printf("Notas: %.2f e %.2f\n", nota1, nota2);
        System.out.println("Media: "+ media);
        System.out.printf("%c - %s",letra,situacao);
    }
    
}
