package Nivel_Intermediario;

public enum Afiliacao {
    ALIANCA_REBELDE("Lutam contra o Império Galáctico em busca de liberdade e justiça"),
    IMPERIO_GALACTICO("Regime autoritário que busca controle total da galáxia"),
    ORDEM_JEDI("Guardião da paz e da justiça, usuários da Força no lado da luz"),
    SITH("Seguidores do lado sombrio da Força, em busca de poder e dominação"),
    NEUTRO("Não se alinham diretamente a nenhum dos lados, mantendo independência");

    private String descricao;

    Afiliacao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
