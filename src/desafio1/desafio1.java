package desafio1;

public class desafio1 {
    public static void main(String[] args) {

        // Ninja 1
        String nomeNinja1 = "Naruto Uzumaki";
        int idade1 = 16;
        String missao1 = "Encontrar um bandido";
        String statusDaMissao1 = "Em andamento";
        char nivelDaMissao1 = 'A';

        // Verificar nivel da missao e idade do ninja

        if (idade1 < 15) {
            if (nivelDaMissao1 == 'C' || nivelDaMissao1 == 'D') {
                statusDaMissao1 = "Concluida";
            } else {
                statusDaMissao1 = "Não concluida, idade insuficiente";
            }
        } else {
            statusDaMissao1 = "Concluida";
        }

        // Ninja 2
        String nomeNinja2 = "Sasuke Uchiha";
        int idade2 = 9;
        String missao2 = "Reconhecimento da aldeia";
        String statusDaMissao2 = "Em andamento";
        char nivelDaMissao2 = 'S';

        if (idade2 < 15) {
            if (nivelDaMissao2 == 'C' || nivelDaMissao2 == 'D') {
                statusDaMissao2 = "Concluida";
            } else {
                statusDaMissao2 = "Não concluida, idade insuficiente";
            }
        } else {
            statusDaMissao2 = "Concluida";
        }


        // Ninja 3
        String nomeNinja3 = "Sakura Haruno";
        int idade3 = 16;
        String missao3 = "Curar feridos da guerra";
        String statusDaMissao3 = "Concluido";
        char nivelDaMissao3 = 'D';

        if (idade3 < 15) {
            if (nivelDaMissao3 == 'C' || nivelDaMissao3 == 'D') {
                statusDaMissao3 = "Concluida";
            } else {
                statusDaMissao3 = "Não concluida, idade insuficiente";
            }
        } else {
            statusDaMissao3 = "Concluida";
        }

        System.out.println("-----------------------------------------");

        System.out.println("Nome do ninja: " + nomeNinja1);
        System.out.println("Idade do ninja: " + idade1);
        System.out.println("Missao: " + missao1);
        System.out.println("Status da missao: " + statusDaMissao1);
        System.out.println("Nivel da missao: " + nivelDaMissao1);

        System.out.println("-----------------------------------------");

        System.out.println("Nome do ninja: " + nomeNinja2);
        System.out.println("Idade do ninja: " + idade2);
        System.out.println("Missao: " + missao2);
        System.out.println("Status da missao: " + statusDaMissao2);
        System.out.println("Nivel da missao: " + nivelDaMissao2);

        System.out.println("-----------------------------------------");

        System.out.println("Nome do ninja: " + nomeNinja3);
        System.out.println("Idade do ninja: " + idade3);
        System.out.println("Missao: " + missao3);
        System.out.println("Status da missao: " + statusDaMissao3);
        System.out.println("Nivel da missao: " + nivelDaMissao3);

        System.out.println("-----------------------------------------");


    }
}
