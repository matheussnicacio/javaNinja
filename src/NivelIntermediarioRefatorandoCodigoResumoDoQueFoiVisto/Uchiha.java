package NivelIntermediarioRefatorandoCodigoResumoDoQueFoiVisto;

public class Uchiha extends Ninja implements SharinganInterface {

    // Criar construtores

    public Uchiha(){


    }

    // o SUPER esta nos contrutores porque a classe Uchiha é filha da classe Ninja
    // e por ser filha da classe ninja, só significa que tem que se referenciar
    // usando a palavra reservada SUPER

    public Uchiha(String nome, String aldeia, int idade) {

        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    /*
    * Metodo:
    * Implementa da interface Sharingan
    *
    * */
    public void sharinganAtivado(){
        System.out.println(nome + " : Ativou o Sharingan ");
    }


}
