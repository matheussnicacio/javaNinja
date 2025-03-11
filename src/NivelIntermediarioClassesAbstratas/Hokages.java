package NivelIntermediarioClassesAbstratas;

public abstract class Hokages {
    String nome;
    int idade;
    boolean vivoOuNao;
    int missoes;
    double saldoBancario;
    double altura;

    // Classe abstrata
    public abstract void sabedoriaHokage();

    public Hokages() {
        // Construtor vazio, sem argumentos ]

    }

    // Criar um construtor com argumento
    public Hokages(String nome) {
        this.nome = nome;
    }

    public Hokages(int idade) {
        this.idade = idade;

    }

    // All args constructor = Construtor com todos os argumentos
    public Hokages(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }

    public Hokages(double altura) {
        this.altura = altura;
    }

    // Voce consegue criar automaticamente os construtores no intelliJ
    public Hokages(String nome, int idade, boolean vivoOuNao, int missoes, double saldoBancario, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
        this.missoes = missoes;
        this.saldoBancario = saldoBancario;
        this.altura = altura;
    }
}
