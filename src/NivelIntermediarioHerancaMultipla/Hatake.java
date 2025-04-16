package NivelIntermediarioHerancaMultipla;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface, HokageInterface{

    public void boasVindas(){
        System.out.println(nome + " Eu sou um Hatake ");
    }

    // Esse metodo vem da interface
    public void hokageAtivo(){
        System.out.printf(nome + " Eu sou um Hokage ");
    }

    // Esse metodo vem da interface
    public void ninjaDeElite(){
        System.out.println(nome + " Eu sou um Ninja de Elite ");

    }

    // Esse metodo vem direto da interface
    public void sharinganAtivado() {
        System.out.println(nome + " : Ativou o Sharingan");
    }

}
