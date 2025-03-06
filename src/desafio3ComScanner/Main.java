package desafio3ComScanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int NUMERO_MAX = 3;
        Uchiha[] ninjas = new Uchiha[NUMERO_MAX]; // Alterado para armazenar objetos Uchiha

        int qtdNinjas = 0;
        int opcao = 0;

        Scanner scanner = new Scanner(System.in);

        while (opcao != 3) {
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Adicionar novos ninjas");
            System.out.println("2 - Exibir informação dos ninjas");
            System.out.println("3 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (qtdNinjas < NUMERO_MAX) {
                        Uchiha novoNinja = new Uchiha(); // Criar um novo objeto a cada cadastro

                        System.out.println("Nome do ninja para cadastro: ");
                        novoNinja.nome = scanner.nextLine();

                        System.out.println("Idade do ninja: ");
                        novoNinja.idade = scanner.nextInt();
                        scanner.nextLine(); // Consumir quebra de linha

                        System.out.println("Nível da dificuldade: ");
                        novoNinja.nivelDeDificuldade = scanner.nextLine();

                        System.out.println("Status da missão: ");
                        novoNinja.statusMissao = scanner.nextLine();

                        System.out.println("Missão: ");
                        novoNinja.missao = scanner.nextLine();

                        System.out.println("Habilidade especial: ");
                        novoNinja.habilidadeEspecial = scanner.nextLine();

                        ninjas[qtdNinjas] = novoNinja; // Armazena o objeto no array
                        qtdNinjas++;

                        System.out.println("Ninja cadastrado com sucesso!");
                    } else {
                        System.out.println("A lista está cheia, impossível cadastrar. Tente novamente.");
                    }
                    break;

                case 2:
                    if (qtdNinjas == 0) {
                        System.out.println("Nenhum ninja encontrado.");
                    } else {
                        for (int i = 0; i < qtdNinjas; i++) {
                            ninjas[i].mostrarHabilidadeEspecial(); // Chama o método de exibição
                        }
                    }
                    break;

                case 3:
                    System.out.println("Estamos saindo do programa...");
                    break;

                default:
                    System.out.println("Essa opção não é válida.");
                    break;
            }
        }
        scanner.close();
    }
}

