package NivelIntermediarioENUMS;

public class Main {
    public static void main(String[] args) {

        Missoes missao1 = new Missoes("Resgatar cachorro",RankDeMissoes.A);
        missao1.exibirDetalhes();

        Missoes missao2 = new Missoes("Derrotar o Zabuza",RankDeMissoes.S);
        missao2.exibirDetalhes();

    }
}
