package vendas_itens;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Venda venda = new Venda("ClientePrincipal");

        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarItem(venda, scanner);
                    break;
                case 2:
                    calcularValorTotal(venda);
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("===== MENU =====");
        System.out.println("1. Adicionar Item");
        System.out.println("2. Calcular Valor Total");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void adicionarItem(Venda venda, Scanner scanner) {
        System.out.print("Digite a descrição do item: ");
        String descricao = scanner.next();

        System.out.print("Digite o valor unitário do item: ");
        double valorUnitario = scanner.nextDouble();

        System.out.print("Digite a quantidade do item: ");
        double quantidade = scanner.nextDouble();

        ItemVenda item = new ItemVenda(descricao, valorUnitario, quantidade);
        venda.adicionarItem(item);

        System.out.println("Item adicionado com sucesso!");
    }

    private static void calcularValorTotal(Venda venda) {
        double valorTotal = venda.calcularValorTotal();
        System.out.println("O valor total da venda é: " + valorTotal);
    }
}