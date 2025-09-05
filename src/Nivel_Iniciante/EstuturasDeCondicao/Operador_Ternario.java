package Nivel_Iniciante.EstuturasDeCondicao;

public class Operador_Ternario {
    public static void main(String[] args) {

        String nome = "Luke";
        short numeroDeMissoes = 16;

        String patente = (numeroDeMissoes >= 15) ? nome + "é um Jedi" : nome + " ainda é uma Padawan";
        System.out.println(patente);
    }
}
