
package UsandoSwitchCase.exercicios;

import java.util.Scanner;

/** Lista 2
 * Questao 12
 * @author VAIO
 */
public class FolhaDePagamento {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor por hora e hhoras trabalhadas: ");
        float valor = scan.nextFloat();
        int horas = scan.nextInt();
        
       float salario = valor * horas;
       float ir = 0;
       
       if(salario > 900 && salario <= 1500 ){
           ir = 5;
       }else if (salario > 1500 && salario <= 2500){
           ir = 10;
       }else if(salario > 2500){
           ir = 20;
       }
       
       float inss = 10;
       float fgts = 11;
       
       float desconto = (salario*ir/100) + (inss*salario/100);
       
        System.out.println("Salario bruto: " + salario);
        System.out.println("(-) IR: "+(salario*ir/100));
        System.out.println("(-) INSS: "+(inss*salario/100));
        System.out.println("FGTS: "+ (fgts*salario/100));
        System.out.println("Total de descontos: R$ "+ desconto);
        System.out.println("Salario liquido: " + (salario - desconto));
    }
    
}
