import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Juros> historico = new ArrayList<>();
        Juros juros = null;
        int op;

        do {
            System.out.println("\n------------------ Sistema de Cálculo de Juros ------------------");
            System.out.println("Escolha o tipo de juros:");
            System.out.println("1 - Juros Simples");
            System.out.println("2 - Juros Compostos");
            System.out.println("3 - Juros com Carência");
            System.out.println("0 - Sair");
            System.out.println("Opção: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite o capital (R$): ");
                    double capitalSimples = sc.nextDouble();

                    System.out.println("Digite a taxa de juros (%): ");
                    double taxaSimples = sc.nextDouble();

                    System.out.println("Digite o tempo (meses): ");
                    int tempoSimples = sc.nextInt();
                    sc.nextLine();

                    juros = new JurosSimples(capitalSimples, taxaSimples, tempoSimples);
                    historico.add(juros);
                    System.out.println("-----------------------------------------------------------------------");
                    break;

                case 2:
                    System.out.println("Digite o capital (R$): ");
                    double capitalComposto = sc.nextDouble();

                    System.out.println("Digite a taxa de juros (%): ");
                    double taxaComposta = sc.nextDouble();

                    System.out.println("Digite o tempo (meses): ");
                    int tempoComposto = sc.nextInt();
                    sc.nextLine();

                    juros = new JurosCompostos(capitalComposto, taxaComposta, tempoComposto);
                    historico.add(juros);
                    System.out.println("-----------------------------------------------------------------------");
                    break;

                case 3:
                    System.out.println("Digite o capital (R$): ");
                    double capitalCarencia = sc.nextDouble();

                    System.out.println("Digite a taxa de juros (%): ");
                    double taxaCarencia = sc.nextDouble();

                    System.out.println("Digite o tempo (meses): ");
                    int tempoCarencia = sc.nextInt();

                    System.out.println("Digite o período de carência (meses): ");
                    int carencia = sc.nextInt();
                    sc.nextLine();

                    juros = new JurosCarencia(capitalCarencia, taxaCarencia, tempoCarencia, carencia);
                    historico.add(juros);
                    System.out.println("-----------------------------------------------------------------------");
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    System.out.println("\n------------------ Histórico de Cálculos ------------------");
                    for (Juros j : historico) {
                    j.exibirDetalhes();}
                    System.out.println("-----------------------------------------------------------------------");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    System.out.println("-----------------------------------------------------------------------");
            }

            if (juros != null) {
                System.out.println("\n------------------ Resultado ------------------");
                juros.exibirDetalhes();
                juros = null;
                System.out.println("-----------------------------------------------------------------------");
            }

        } while (op != 0);

        sc.close();
    }
}