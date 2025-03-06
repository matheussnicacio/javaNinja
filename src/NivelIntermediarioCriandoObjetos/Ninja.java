package NivelIntermediarioCriandoObjetos;

public class Ninja {

    String nome;
    String aldeia;
    int idade;

    /*
     * O metodo VOID nao retorna valor nenhum !
     */

    public void SharinganAtivado() {
        System.out.println("O sharingan ativou");
    }

    /*
     * O metodo String vai ter que retornar uma String
     */

    public String EuSouUmNinja(){
        return "Oi, Eu sou um ninja";
    }

    /*
     * O metodo Int vai ter que retornar um Int
     */

    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage) {

        return idadeMinimaParaSerHokage - idade;
    }
}

