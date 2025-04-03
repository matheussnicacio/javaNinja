package NivelIntermediarioEstruturaDeDadosStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Array
        // Sao estaticos e tem referencia de memoria
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto Uzumaki";

        // Listas
        // Sao dinamicas e tamanho aumenta e diminui conforme precisa
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");

        // Stack
        // O ultimo elemento que entrou é obrigatoriamente o primeiro a sair
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.add("Naruto Uzumaki");
        ninjaStack.push("Sasuke Uchiha");
        ninjaStack.push("Sakura Haruno");
        ninjaStack.push("Hinata Hyuga");
        ninjaStack.push("Kakashi Hatake");

        System.out.println("Minha stack atual : " + ninjaStack);

        ninjaStack.pop();

        System.out.println("Minha stack atualizada com POP : " + ninjaStack);
        System.out.println("Minha stack com proximo elemento do topo : " + ninjaStack.peek());
        System.out.println("Tamanho da stack : " + ninjaStack.size() + " elementos");

        System.out.println("Minha stack atual : " + ninjaStack);


    }
}
