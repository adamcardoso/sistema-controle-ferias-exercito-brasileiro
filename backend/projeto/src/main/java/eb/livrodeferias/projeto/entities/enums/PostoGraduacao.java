package eb.livrodeferias.projeto.entities.enums;

public enum PostoGraduacao {
    SOLDADO(1, "SOLDADO"),
    CABO(2, "CABO"),
    TERCEIRO_SARGENTO(3, "3º_SARGENTO"),
    SEGUNDO_SARGENTO(4, "2º_SARGENTO"),
    PRIMEIRO_SARGENTO(5, "1º_SARGENTO"),
    SUBTENENTE(6, "SUBTENENTE"),
    ASPIRANTE(7, "ASPIRANTE"),
    SEGUNDO_TENENTE(8, "2º_TENENTE"),
    PRIMEIRO_TENENTE(9, "1º_TENENTE"),
    CAPITAO(10, "CAPITAO"),
    MAJOR(11, "MAJOR"),
    TENENTE_CORONEL(12, "TENENTE_CORONEL"),
    CORONEL(13, "CORONEL"),
    GENERAL_BRIGADA(14, "GENERAL_BRIGADA"),
    GENERAL_DIVISAO(15, "GENERAL_DIVISAO"),
    GENERAL_EXERCITO(16, "GENERAL_EXERCITO");

    private int cod;
    private String descricao;

    PostoGraduacao(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public int getCod() {
        return cod;
    }

    public String getDescricao () {
        return descricao;
    }

    public static PostoGraduacao toEnum(Integer cod){
        if (cod == null){
            return null;
        }
        for (PostoGraduacao x : PostoGraduacao.values()){
            if (cod.equals(x.getCod())){
                return x;
            }
        }

        throw new IllegalArgumentException("Id inválido: " + cod);
    }
}
