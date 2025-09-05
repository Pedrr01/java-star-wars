package Nivel_Intermediario;

import java.util.List;

public class CacadorDeRecompensas extends Personagem{
    private String equipamento;

    public CacadorDeRecompensas(String nome, int idade, Afiliacao afiliacao, String equipamento){
        super(nome, idade, afiliacao);
        this.equipamento = equipamento;
    }

    /*
     *  TODO: Sobrecarga do atributo nivelDeForca da Superclasse
     * */
    public CacadorDeRecompensas(String nome, int idade, Afiliacao afiliacao, int nivelDeForca, String equipamento) {
        super(nome, idade, afiliacao, nivelDeForca);
        this.equipamento = equipamento;
    }
    /*
     *  TODO: Sobrecarga do atributo filme da Superclasse
     * */

    public CacadorDeRecompensas(String nome, int idade, Afiliacao afiliacao, int nivelDeForca, List<Filmes> filme, String equipamento) {
        super(nome, idade, afiliacao, nivelDeForca, filme);
        this.equipamento = equipamento;
    }

    /*
     *  Sobrescrita do method falar() da Superclasse Personagem.
     * */
    @Override
    public void falar() {
        System.out.println("Não sigo heróis nem vilões, sigo contratos.");
    }

    public void negociar(){
        System.out.println("");
    }

    /*
     *  TODO: Sobrecarga do method negociar()
     * */
    public void negociar(double valor){
        if(valor <= 1000){
            System.out.println("Com esse valor? Nem começo o trabalho.");
        }else if(valor > 1000){
            System.out.println("Aceito negociar…");
        }
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    @Override
    public String toString() {
        return "Caçador De Recompensas: " + getNome();
    }
}
