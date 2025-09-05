package Nivel_Iniciante.EstuturasDeCondicao;

public class If_Else {
    public static void main(String[] args) {
        String nome = "Anakin";
        int idade = 30;
        short numDeMissoes = 2;
        String patente = "";
        
        if(idade >= 50 && numDeMissoes >= 20){
            patente = "Membro do Conselho Jedi";
        }else if((idade >= 40 && numDeMissoes >= 15) || (idade >= 45 && numDeMissoes >= 10)){
            patente = "Mestre Jedi";
        }else if (idade >= 25 && numDeMissoes >= 5) {
            patente = "Cavaleiro Jedi";
        } else {
            patente = "c";
        }

        System.out.println(nome + " é " + patente);
    }
}
