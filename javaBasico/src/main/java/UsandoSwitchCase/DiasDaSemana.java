
package UsandoSwitchCase;

import java.util.Scanner;

/**
 * 
 * @author VAIO
 */
public class DiasDaSemana {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um dia da semana: ");
        int diaSemana = scan.nextInt();
        
       /* switch(diaSemana){ //dado o dia da semana
            
            case 1: //caso o dia da semana seja 1 faça ...
                System.out.println("Domingo");
                break;
                
            case 2:
                System.out.println("Segunda");
                break;
                
            case 3:
                System.out.println("Terça");
                break;
            
            case 4:
                System.out.println("Quarta");
                break;
            
            case 5:
                System.out.println("Quinta");
                break;
            
            case 6:
                System.out.println("Sexta");
                break;
        
            case 7:
                System.out.println("Sabádo");
                break;
                
            default: //caso n seja nenhuma das opções
                System.out.println("Não é um dia da semana");
        }*/
        
       //ou pode ser utilizado tambem como:
       
       switch(diaSemana){
		case 2: 
		case 3: 
		case 4: 
		case 5: 
		case 6: System.out.println("Dia útil"); break;
		case 1: 
		case 7: System.out.println("Fim de semana"); break;
		default: System.out.println("Não é uma dia da semana válido");
	}
    }
    
}
