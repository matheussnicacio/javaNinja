package NivelIntermediarioOverloadSobrecargaDeConstrutores;

public class Uzumaki extends Ninja{

    public Uzumaki(){

        super();

    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }


    // Sobreescrever o metodo da classe Ninja
    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + "Esse é meu ataque Uzumaki. Eu já completei : " + numeroDeMissoesConcluidas);
    }



}
