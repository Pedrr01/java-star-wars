package Nivel_Intermediario;

public final class Nave {
    private String modelo;
    private int velocidade;
    private Personagem piloto;

    public Nave(String modelo, int velocidade, Personagem piloto) {
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.piloto = piloto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public Personagem getPiloto() {
        return piloto;
    }

    public void setPiloto(Personagem piloto) {
        this.piloto = piloto;
    }

    public void saltarParaHiperespaco(){
        System.out.println("Ajustando coordenadas e preparando salto para o hiperespaço…");
    }

    @Override
    public String toString() {
        return "Nave: " + modelo;
    }
}
