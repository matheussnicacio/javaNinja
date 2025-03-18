package NivelIntermediarioHerancaMultipla;

public class Main {
    public static void main(String[] args) {

        // Obj Uchiha

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da folha";
        sasuke.idade = 18;
        sasuke.sharinganAtivado();



        // Obj Hatake

        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi Hatake";
        kakashi.aldeia = "Aldeia da folha";
        kakashi.idade = 48;
        kakashi.boasVindas();
        kakashi.sharinganAtivado();
        kakashi.ninjaDeElite();
    }

    // Obj Naruto

    Uzumaki naruto = new Uzumaki();

}
