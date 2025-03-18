package NivelIntermediarioOverloadSobrecargaDeConstrutores;

public abstract class Ninja implements EstrategiaDeBatalha {

    // TODO: Incluir 2 novos atributos: numeroDeMissoesConcluidas, Rank
    // TODO : Rank: Gennin, Chunnin, Jounnin, Hokage


    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;

    public Ninja() {

    }

    // Metodo existente :  Primeiro metodo
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // TODO : Sobrecarga do construtor chamando os novos atributos
    // Sobrecarga de metodos voce nao precisa redeclarar o construtor so os novos atributos
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }


    // Metodos geral! Todos os ninjas vao ter

    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial ");
    }

    // Metodo abstrato - Obrigatorio em todas as classes

    // Sobreescrevendo o metodo da interface
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println(" Essa é minha estrategia de combate ");
    }


}
