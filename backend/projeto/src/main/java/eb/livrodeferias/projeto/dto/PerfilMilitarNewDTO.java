package eb.livrodeferias.projeto.dto;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

public class PerfilMilitarNewDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotEmpty(message="Preenchimento obrigatório")
    private String identidadeMilitar;

    @NotEmpty(message="Preenchimento obrigatório")
    @Length(min=5, max=120, message="O tamanho deve ser entre 5 e 120 caracteres")
    private String nomeDoMilitar;

    @NotEmpty(message="Preenchimento obrigatório")
    private Integer postoEGraduacao;

    @NotEmpty(message="Preenchimento obrigatório")
    private String secao;


    private String ramal;

    @NotEmpty(message="Preenchimento obrigatório")
    private String rua;

    @NotEmpty(message="Preenchimento obrigatório")
    private String numero;

    @NotEmpty(message="Preenchimento obrigatório")
    private String cep;

    private String complemento;

    @NotEmpty(message="Preenchimento obrigatório")
    private String bairro;

    @NotEmpty(message="Preenchimento obrigatório")
    private String telefone;

    private Integer cidadeId;

    public PerfilMilitarNewDTO(){

    }

    public String getIdentidadeMilitar() {
        return identidadeMilitar;
    }

    public void setIdentidadeMilitar(String identidadeMilitar) {
        this.identidadeMilitar = identidadeMilitar;
    }

    public String getNomeDoMilitar() {
        return nomeDoMilitar;
    }

    public void setNomeDoMilitar(String nomeDoMilitar) {
        this.nomeDoMilitar = nomeDoMilitar;
    }

    public Integer getPostoEGraduacao() {
        return postoEGraduacao;
    }

    public void setPostoEGraduacao(Integer postoEGraduacao) {
        this.postoEGraduacao = postoEGraduacao;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getCidadeId() {
        return cidadeId;
    }

    public void setCidadeId(Integer cidadeId) {
        this.cidadeId = cidadeId;
    }
}
