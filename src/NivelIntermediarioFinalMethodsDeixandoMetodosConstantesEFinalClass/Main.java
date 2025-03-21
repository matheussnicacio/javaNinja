package NivelIntermediarioFinalMethodsDeixandoMetodosConstantesEFinalClass;


public class Main {

    public static void main(String[] args) {

        // Obj uzumaki

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da folha";
        naruto.idade = 16;
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();
        System.out.println("---------");
        naruto.tacarKunai();
        System.out.println(naruto.altura);


        Anbu ninjaAnbu = new Anbu();
        ninjaAnbu.nome = "Ninja Aleatorio";

        // Obj Uchiha

        Uchiha sasuke = new Uchiha("Sasuke uchiha", "aldeia da folha", 18, 2);
        sasuke.habilidadeEspecial();

        // Obj Uchiha 2

        Uchiha itachi = new Uchiha("Iachi Uchiha", "aldeia da folha", 18);
        itachi.habilidadeEspecial();



    }

}

