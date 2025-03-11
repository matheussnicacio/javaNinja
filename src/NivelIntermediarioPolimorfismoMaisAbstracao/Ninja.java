package NivelIntermediarioPolimorfismoMaisAbstracao;

public abstract class Ninja implements EstrategiaDeBatalha{

    String nome;
    int aldeia;
    int idade;

    // Metodos geral! Todos os ninjas vao ter

    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial ");
    }

    // Metodo abstrato - Obrigatorio em todas as classes

    // Sobreescrevendo o metodo da interface
    @Override
    public void estrategiaDeBatalhaNinja(){
        System.out.println(" Essa é minha estrategia de combate ");
    }

}
