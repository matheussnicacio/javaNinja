package NivelIntermediarioFinalMethodsDeixandoMetodosConstantes;


public class Ninja implements EstrategiaDeBatalha {

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    final double altura = 2.10;


    public Ninja() {

    }

    // TODO NINJA VAI FAZER OBRIGATORIAMENTE

    final void tacarKunai() {
        System.out.println("EU SOU UM METODO DA CLASSE MAE");
    }


    // Metodo existente :  Primeiro metodo
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // TODO : Sobrecarga do construtor chamando os novos atributos
    // Sobrecarga de metodos voce nao precisa redeclarar o construtor so os novos atributos
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
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
