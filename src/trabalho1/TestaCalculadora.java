package trabalho1;
import java.util.Scanner;

public class TestaCalculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        int sele = 0;
        
        while(sele != 5){
            calculadora.imprimeMenu();
            
            sele = scanner.nextInt();
            switch(sele){
                case 1:
                    System.out.print("Digite um número: ");
                    float numero = scanner.nextFloat();
                    calculadora.Empilharnumero(numero);
                    break;
                
                case 2:
                    System.out.println("Digite um operador: ");
                    char operador = scanner.next().charAt(0);
                    if (operador == '+' || operador == '-' || operador == '*' || operador == '/') {
                        calculadora.Empilharoperador(operador);
                    } else {
                        System.out.println("Operador inválido. Tente novamente.");
                    }
                    break;
                case 3:
                    calculadora.Calcular();
                    break;
                case 4:
                    calculadora.imprimePilhas();
                    break;
                case 5:
                    System.out.println("Saindo... ");
                    break;
                default:
                    System.out.println("Opção Inválida. Tente novamente");
                    break;
                    
            }                

        }

        scanner.close();


}
}