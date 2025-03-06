package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {
        /*
         * SwitchCases: Que servem para gerar casos especificos
         * Objetivo: Pedir pro usuario escolher entre os Ninjas
         */

        // Pedir ao usuario
        Scanner scanner = new Scanner(System.in);

        // Mostrar opcoes para o usuario
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki: ");
        System.out.println("2 - Sasuke Uchiha: ");
        System.out.println("3 - Sakura Haruno: ");

        // Pedir para o usuario escolher uma das opcoes
        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Voce digitou o numero: " + escolhaDoUsuario);

        // Reacao ao escolher um personagem

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("O usuario escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("O usuario escolheu o Sasuke Uchiha");
                break;
            case 3:
                System.out.println("O usuario escolheu a Sakura Haruno");
                break;

            default:
                System.out.println("Voce não digitou uma opcao valida! Tente denovo");
        }

        // fecha a caixa
        scanner.close();
    }
}
