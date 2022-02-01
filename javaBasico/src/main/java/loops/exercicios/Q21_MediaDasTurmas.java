
package loops.exercicios;

import java.util.Scanner;

/** Lista 03
 * Questao 21
 * @author VAIO
 */
public class Q21_MediaDasTurmas {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o numero de turmas: ");
        int numTurmas = scan.nextInt();
        
        int numAlunos = 0;
        int soma = 0;
        boolean invalido = true;
        double media = 0;
        
        
        for(int i = 0; i< numTurmas; i++){
            invalido = true;
            
            do{     
                System.out.println("Digite o numero de alunos da turma " 
                        + (i+1) + ": ");
                
                numAlunos = scan.nextInt();
                
                if(numAlunos <= 40){
                    invalido = false;
                }else{
                    System.out.println("Invalido! numero de alunos inválido.");
                }
                
            }while(invalido);
            
            soma +=numAlunos;
        }
        
        media = soma/ numTurmas;
        
        System.out.println("Média: " + media);
    }
    
}
