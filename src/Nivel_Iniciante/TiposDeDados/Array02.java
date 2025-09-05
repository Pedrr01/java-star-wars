package Nivel_Iniciante.TiposDeDados;

public class Array02 {
    public static void main(String[] args) {
        String[] jedis = new String[3];

        jedis[0] = "Luke";
        jedis[1] = "Mestre Yoda";
        jedis[2] = "Obi Wan";
        System.out.println(jedis[1]);

        jedis = new String[3];
        jedis[0] = "Anakin";
        jedis[1] = "Conde Dookan";
        jedis[2] = "Qui-Gon";

        for(int c = 0; c <= 2; c++){
            System.out.println(c + " Jedi - " + jedis[c]);
        }
    }
}
