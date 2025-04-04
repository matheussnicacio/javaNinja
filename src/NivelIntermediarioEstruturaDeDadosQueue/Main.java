package NivelIntermediarioEstruturaDeDadosQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        // Queue // FILAS

        Queue<String> ninjasQueue = new LinkedList<>();

        ninjasQueue.add("Naruto");
        ninjasQueue.add("Sasuke");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Kakashi");
        ninjasQueue.add("Shikamaru");

        // Mostrar a fila
        System.out.println("Ninjas na fila : " + ninjasQueue);

        // Tirar um ninja da fila
        ninjasQueue.poll();
        System.out.println("Ninjas fla depois do POLL : " + ninjasQueue);

        // Como ver quem é o primeiro
        System.out.println("Ninja no HEAD : " + ninjasQueue.peek());

        // Adicionar a fila
        ninjasQueue.add("Hashirama Senju");
        ninjasQueue.add("Tobirama Senju");

        // Nao da para deletar o tail

        // Esvaziar fila
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        System.out.println("Ninjas na fila : " + ninjasQueue);

        // Verificar se a fila esta vazia
        if(ninjasQueue.isEmpty()){
            System.out.println("A fila esta vazia");
        }
    }
}
