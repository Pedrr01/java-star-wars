package Nivel_Iniciante.TiposDeDados;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {

        List<String> nomes = new java.util.ArrayList<>();
        nomes.add("Luke");
        nomes.add("Darth Vader");
        nomes.add("Yoda");

        System.out.println(nomes);
        System.out.println("Tamanho da Lista:" + nomes.size());
        System.out.println(nomes.get(1));
        nomes.set(2, "Mestre Yoda");

        System.out.println("---- Lista ----");
        for(String nome : nomes){
            System.out.println(nome);
        }
    }
}
