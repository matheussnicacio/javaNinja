package NivelIntermediarioList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Array
        // Sao estaticos, nao alteram de tamanho
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";
        System.out.println("Printando Array: " + ninjasArray[0]);

        // Listas
        // Lista nao sao estaticas, elas podem aumentar ou diminuir

        List<String> ninjasList = new ArrayList<String>();
        ninjasList.add("Naruto Uzumaki"); // Index 0
        ninjasList.add("Sasuke Uchiha"); // Index 1
        ninjasList.add("Sakura Haruno"); // Index 2
        ninjasList.add("Tobirama Senju"); // Index 3

        // Adicionar na Lista
        ninjasList.add("Kakashi Hatake");


        System.out.println("NinjasList: " + ninjasList);

        // Remover da Lista
        ninjasList.remove("Kakashi Hatake");
        System.out.println("NinjasList: " + ninjasList);

        // Trocar elementos
        ninjasList.set(3, "Hashirama Senju");

        // Ver o tamanho da Lista
        System.out.println("Tamanho NinjasList: " + ninjasList.size());

    }
}
