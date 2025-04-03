package NivelIntermediarioArrayListStackResumao;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

//        1. Arrays sao estaticos
//        - Exigem um tamanho pré definido
//
//        2. Listas são dinamicas
//        - Aumentam e diminuem de tamanho conforme precisamos
//
//        3. Stacks sao unicos
//        - Exigem uma ordem! O ultimo a entrar é o primeiro a sair!


        // Arrays
        String[] nomeNinjaArray = new String[5];

        System.out.println("---------- ARRAY ----------");

        nomeNinjaArray[0] = "Naruto Uzumaki";
        nomeNinjaArray[1] = "Sasuke Uchiha";
        nomeNinjaArray[2] = "Sakura Haruno";
        nomeNinjaArray[3] = "Hinata Hyuga";

        System.out.println("nomeNinjaArray: " + nomeNinjaArray);
        System.out.println("nomeNinjaArray[0]: " + nomeNinjaArray[4]);

        // Lista é um pouco mais lenta em comparacao com ARRAY
        System.out.println("---------- LISTA ----------");

        List<String> nomeNinjaList = new ArrayList<>();
        nomeNinjaList.add("Naruto Uzumaki");
        nomeNinjaList.add("Sasuke Uchiha");
        nomeNinjaList.add("Sakura Haruno");
        nomeNinjaList.add("Madara Uchiha");

        System.out.println(nomeNinjaList);

        System.out.println("---------- STACKS ----------");
        Stack<String> nomeNinjaStack = new Stack<>();
        nomeNinjaStack.push("Naruto Uzumaki");
        nomeNinjaStack.push("Sasuke Uchiha");
        nomeNinjaStack.push("Sakura Haruno");

        System.out.println("Mostrar Stack: " + nomeNinjaStack);
        System.out.println("Tirar da pilha / stack = " +  nomeNinjaStack.pop());
        System.out.println("Mostrar Stack: " + nomeNinjaStack);
        System.out.println("Ninja no topo (Sem remover): " + nomeNinjaStack.peek());

    }
}
