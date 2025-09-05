package Nivel_Iniciante.EstruturasDeDados;

import java.util.LinkedList;

public class ListaEncadeada {
    public static void main(String[] args) {
        LinkedList<Pessoa> lista = new LinkedList<>();
        lista.add(new Pessoa("Pedro", 20));
        lista.add(new Pessoa("Lucas", 19));
        lista.add(new Pessoa("Anna", 15));

        System.out.println(lista);
        lista.addFirst(new Pessoa("Davi", 10));
        System.out.println(lista);
        lista.removeLast();
        System.out.println(lista);

    }
}
