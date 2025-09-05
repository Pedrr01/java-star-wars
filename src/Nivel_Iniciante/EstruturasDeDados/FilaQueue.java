package Nivel_Iniciante.EstruturasDeDados;

import java.util.LinkedList;
import java.util.Queue;

public class FilaQueue {
    public static void main(String[] args) {
        Queue<String> nomes = new LinkedList<>();

        nomes.add("Pedro");
        nomes.add("Lucas");
        nomes.add("Anna");

        System.out.println("Primeiro da fila: " + nomes.peek());
        System.out.println("Tamanho da fila: " + nomes.size());
        System.out.println("Fila: " + nomes);
        nomes.poll();
        System.out.println("Fila atualizada: " + nomes);

    }
}
