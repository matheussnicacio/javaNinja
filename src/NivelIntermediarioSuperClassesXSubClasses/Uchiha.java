package NivelIntermediarioSuperClassesXSubClasses;

public class Uchiha extends Ninja{

    public Uchiha(){
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    // Sobreescrever o metodo da classe Ninja
    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + "Esse é meu ataque Uchiha" );
    }

}
