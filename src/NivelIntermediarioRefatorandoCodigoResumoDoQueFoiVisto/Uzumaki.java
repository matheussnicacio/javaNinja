package NivelIntermediarioRefatorandoCodigoResumoDoQueFoiVisto;

public class Uzumaki extends Ninja{

    Biju biju;

    public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank,  Biju biju) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
        this.biju = biju;
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + "Esse é meu ataque Uzumaki. Eu já completei : " + numeroDeMissoesConcluidas);
    }




}
