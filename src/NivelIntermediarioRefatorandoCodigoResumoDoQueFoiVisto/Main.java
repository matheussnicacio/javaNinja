package NivelIntermediarioRefatorandoCodigoResumoDoQueFoiVisto;

public class Main {

    public static void main(String[] args) {

        System.out.println("---------Naruto Uzumaki--------");

        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 16, 35, NivelNinja.KAGE, Biju.KURAMA);
        System.out.println(naruto.biju);

        System.out.println("---------Sasuke Uchiha--------");

        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18, 20, NivelNinja.GENIN);
        sasuke.habilidadeEspecial();

        System.out.println("---------Itachi Uchiha-----------");

        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da Folha", 27,60, NivelNinja.JOUNIN);
        itachi.habilidadeEspecial();
        itachi.metodoProvisorio();

        System.out.println("-----------Madara Uchiha-------------");

        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da Folha", 45, 30, NivelNinja.CHUUNIN);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();
        madara.inteligenciaDeCombate();
        madara.inteligenciaDeCombate(90);

        System.out.println("------------------------------------");


    }
}