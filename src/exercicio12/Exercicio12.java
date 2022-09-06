package exercicio12;

import java.util.Scanner;

/**
 *
 * @author Wellington F.
 */
public class Exercicio12 {

    public static void main(String[] args) {
        float valorVeiculo = 1.0f;
        int tipoCombustivel;
        float porcentagemDesconto = 0.0f;
        float valorDesconto = 0.0f;
        float valorPagar = 0.0f;
        Scanner leitor = new Scanner(System.in);
        while (valorVeiculo != 0) {
            System.out.print("Informe o valor do veículo(Para finalizar digite 0): ");
            valorVeiculo = leitor.nextFloat();
            if (valorVeiculo == 0) {
                break;
            } else {
                System.out.println("Qual o tipo de combustível?");
                System.out.println("1 - Álcool");
                System.out.println("2 - Gasolina");
                System.out.println("3 - Diesel");
                System.out.println("Digite o número que corresponde ao combustivel: ");
                tipoCombustivel = leitor.nextInt();
                switch (tipoCombustivel) {
                    case 1:
                        porcentagemDesconto = 0.25f;
                        break;
                    case 2:
                        porcentagemDesconto = 0.21f;
                        break;
                    case 3:
                        porcentagemDesconto = 0.14f;
                        break;
                    default:
                        System.out.println("Número inválido! Finalizando programa...");
                        valorVeiculo = 0f;
                        break;
                }
                valorDesconto = valorVeiculo * porcentagemDesconto;
                valorPagar = valorVeiculo - valorDesconto;
                System.out.println("O total de desconto foi: " + valorDesconto);
                System.out.println("O valor do veículo com desconto: " + valorPagar);
            }
        }
    }
}