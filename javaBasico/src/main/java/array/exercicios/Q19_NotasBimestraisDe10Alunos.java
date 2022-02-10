
package array.exercicios;

import java.util.Scanner;

/** Lista 4
 *  Questao 19
 * @author VAIO
 */
public class Q19_NotasBimestraisDe10Alunos {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        float[] nota1 = new float[10];
        float[] nota2 = new float[10];
        
        for(int i =0; i<10;i++){
            System.out.printf("Digite a primeira nota - aluno %d:\n",(i+1));
            nota1[i] = scan.nextFloat();
            
            System.out.printf("Digite a segundo nota - aluno %d:\n",(i+1));
            nota2[i] = scan.nextFloat();
            
        }
        
        double[] result = new double[10]; 
        for(int i=0; i<10;i++){
            result[i] = (nota1[i] + nota2[i]/2);
        }
        
        for(int i = 0; i<10;i++){
            if(result[i] >= 7){
                System.out.printf("Aluno %d: Aprovado.\n",(i+1));
            }else{
                System.out.printf("Aluno %d: Reprovado.\n",(i+1));
            }
        }
        
    }
    
}
