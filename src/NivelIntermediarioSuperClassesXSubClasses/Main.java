package NivelIntermediarioSuperClassesXSubClasses;

import NivelIntermediarioSuperClassesXSubClasses.Uchiha;
import NivelIntermediarioSuperClassesXSubClasses.Uzumaki;

public class Main {
    public static void main(String[] args) {
        // Objeto Uzumaki

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki ";
        naruto.aldeia = "Aldeia da folha";
        naruto.idade = 16;

        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        // Objeto Uchiha

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha ";
        sasuke.aldeia = "Aldeia da folha";
        sasuke.idade = 17;

        sasuke.habilidadeEspecial();

        // Objeto Uchiha2

        Uchiha itachi = new Uchiha("Itachi Uchiha","Aldeia da folha",18);
        itachi.habilidadeEspecial();


    }
}
