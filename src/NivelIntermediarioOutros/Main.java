package NivelIntermediarioOutros;

import NivelIntermediarioOutros.Ninja;

public class Main {
    public static void main(String[] args) {

        // Objeto 1
        Uzumaki Naruto = new Uzumaki();

        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da folha";
        Naruto.idade = 17;
        Naruto.ModoSabioAtivado();

        // Objeto 2
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.idade = 18;
        Sasuke.SharinganAtivado();

        // Objeto 3
        Haruno Sakura = new Haruno();

        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da folha";
        Sakura.idade = 18;
        Sakura.AtivarCura();

        // Objeto 4
        Hyuga Hinata = new Hyuga();

        Hinata.nome = "Hinata Hyuga";
        Hinata.aldeia = "Aldeia da folha";
        Hinata.idade = 16;
        Hinata.Byakugan();


    }
}
