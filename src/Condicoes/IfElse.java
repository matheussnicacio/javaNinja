package Condicoes;

public class IfElse {
    public static void main(String[] args) {

        /*
         * IF e ELSE - Condicoes
         * else if
         * Objetivo : Passar o ninja de nivel de acordo com o numero de missoes
         */

        // Ninja Naruto
        String nome = "Naruto Uzumaki";
        int idade = 16;
        boolean hokage = false;
        short numeroDemissoes = 14;
        String rank;

        /*
        * if (condicao) {resultado}
        * else if (condicao) {resultado}
        * else {resultado}
         */

        // se (condicao) {faca isso}
        if (numeroDemissoes == 10 && idade > 15) {
            System.out.println("Ranl: Chunin");
        } else if (numeroDemissoes >= 20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("O naruto nao completou o numero de missoes minimo");
        }


    }
}
