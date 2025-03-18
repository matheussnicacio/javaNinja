package NivelIntermediarioOverloadSobrecargaDeConstrutores;

public class Main {

    public static void main(String[] args) {

        // Obj Ninja não pode ser criado pois é abstrato


        // Obj Uzumaki
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 16,30,NivelNinja.CHUUNIN);
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        // Obj Uchiha

        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18, 20, NivelNinja.GENIN);
        sasuke.habilidadeEspecial();


        // Obj Uchiha 2
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da folha", 27);
        itachi.habilidadeEspecial();

        // Obg Uchiha 3
        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da folha", 45, 900, NivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();


    }


}
