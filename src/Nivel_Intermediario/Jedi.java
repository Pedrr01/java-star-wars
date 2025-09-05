package Nivel_Intermediario;

public class Jedi extends Personagem implements Forca {
    private String corSabreDeLuz;

    public Jedi(String nome, int idade, Afiliacao afiliacao, String corSabreDeLuz) {
        super(nome, idade, afiliacao);
        this.corSabreDeLuz = corSabreDeLuz;
    }

    /*
     *  TODO: Sobrecarga do atributo nivelDeForca da Superclasse
     * */

    public Jedi(String nome, int idade, Afiliacao afiliacao, int nivelDeForca, String corSabreDeLuz) {
        super(nome, idade, afiliacao, nivelDeForca);
        this.corSabreDeLuz = corSabreDeLuz;
    }

    /*
    *  Sobrescrita do method usarForcaEmCombate() e telepatia() da interface Forca.
    * */
    @Override
    public void usarForcaEmCombate() {
        System.out.println("Estou usando a Força para combater o Império e defender a galáxia!");
    }

    @Override
    public void telepatia() {
        System.out.println("Estou usando a Força para comunicar esperança e alertar sobre o perigo.");
    }

    /*
     *  Sobrescrita do method falar() da Superclasse Personagem.
     * */
    @Override
    public void falar(){
        System.out.println("Que a Força esteja com você.");
    }

    public String getCorSabreDeLuz() {
        return corSabreDeLuz;
    }

    public void setCorSabreDeLuz(String corSabreDeLuz) {
        this.corSabreDeLuz = corSabreDeLuz;
    }

    @Override
    public String toString() {
        return "Jedi: " + getNome();
    }
}
