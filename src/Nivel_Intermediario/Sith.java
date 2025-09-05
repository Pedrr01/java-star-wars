package Nivel_Intermediario;

public class Sith extends Personagem implements Forca{
    private String patente;

    public Sith(String nome, int idade, Afiliacao afiliacao, String patente) {
        super(nome, idade, afiliacao);
        this.patente = patente;
    }

    /*
     *  TODO: Sobrecarga do atributo nivelDeForca da Superclasse
     * */
    public Sith(String nome, int idade, Afiliacao afiliacao, int nivelDeForca, String patente) {
        super(nome, idade, afiliacao, nivelDeForca);
        this.patente = patente;
    }

    /*
     *  Sobrescrita do method usarForcaEmCombate() e telepatia() da interface Forca.
     * */
    @Override
    public void usarForcaEmCombate() {
        System.out.println("Estou usando a Força para conquistar a galáxia e dominar todos à minha volta!");
    }

    @Override
    public void telepatia() {
        System.out.println("Estou usando a Força para controlar mentes e dobrar a galáxia à minha vontade.");
    }

    /*
     *  Sobrescrita do method falar() da Superclasse Personagem.
     * */
    @Override
    public void falar(){
        System.out.println("Que a ordem do Império seja feita sem questionamentos.");
    }

    @Override
    public String toString() {
        return "Sith: " + getNome();
    }
}
