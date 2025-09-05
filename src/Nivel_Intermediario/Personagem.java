package Nivel_Intermediario;

public abstract class Personagem {
    private String nome;
    private int idade;
    private Afiliacao afiliacao;
    private int nivelDeForca;

    public Personagem(String nome, int idade, Afiliacao afiliacao) {
        this.nome = nome;
        this.idade = idade;
        this.afiliacao = afiliacao;
    }

    /*
     *  TODO: Sobrecarga do atributo nivelDeForca
     * */
    public Personagem(String nome, int idade, Afiliacao afiliacao, int nivelDeForca) {
        this(nome, idade, afiliacao);
        this.nivelDeForca = nivelDeForca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSaude() {
        return idade;
    }

    public void setSaude(int saude) {
        this.idade = saude;
    }

    public Afiliacao getAfiliacao() {
        return afiliacao;
    }

    public void setAfiliacao(Afiliacao afiliacao) {
        this.afiliacao = afiliacao;
    }

    public String apresentar(){
        return "Eu sou" + nome +". (" + afiliacao + ")";
    }

    public abstract void falar();

    @Override
    public String toString() {
        return "Personagem de Star Wars: " + nome;
    }
}
