package Questao1;
import java.util.Scanner;

public class Principal {
    public Principal() {
        
        Calculadora c = new Calculadora();
        Scanner entrada = new Scanner(System.in);

        int contador = 0;

        do {
            System.out.println("Digite o comando: ");
            contador = entrada.nextInt();
        switch(contador) {

            //Somar
            case 1: System.out.println("Numero1 = ");
                    c.setNum1 = entrada.nextInt();
                    System.out.println("Numero2 = ");
                    c.setNum2(entrada.nextInt());

                    c.resultado = c.num1 + c.num2;
                    System.out.println("Soma = " + c.resultado);
                break;

            //Subtrair
            case 2: System.out.println("Numero1 = ");
                    c.num1 = entrada.nextInt();
                    System.out.println("Numero2 = ");
                    c.num2 = entrada.nextInt();

                    c.resultado = c.num1 - c.num2;
                    System.out.println("Subtração = " + c.resultado);
                break;

            //Dividir
            case 3: System.out.println("Numero1 = ");
                    c.num1 = entrada.nextInt();
                    System.out.println("Numero2 = ");
                    c.num2 = entrada.nextInt();

                    c.resultado = c.num1 / c.num2;
                    System.out.println("Divisão = " + c.resultado);
                break;
            
            //Multiplicar
            case 4: System.out.println("Numero1 = ");
                    c.num1 = entrada.nextInt();
                    System.out.println("Numero2 = ");
                    c.num2 = entrada.nextInt();

                    c.resultado = c.num1 * c.num2;
                    System.out.println("Multiplicação = " + c.resultado);
                break;

            //Sair
            case 5: System.out.println("Saindo....");
                break;

            default: System.out.println("Número inválido, por favor tente novamente");
                break;
        }
    } while(contador > 0 && contador < 6);
        entrada.close();
    }
        public static void main(String[] args) {
            new Principal();
    }
}
