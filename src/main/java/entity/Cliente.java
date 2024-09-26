package entity;


import java.math.BigInteger;
import java.util.GregorianCalendar;
import java.util.Objects;


public class Cliente {
   private BigInteger cpf;
    private String nome;
    private String telefone;
    private String enredeçoEntrega;
    private GregorianCalendar dataNascimento;
    private GregorianCalendar dataCadastro;


    /*Contrutor Vazio*/
    public Cliente() {


    }


    /*Contrutor Cheio*/
    public Cliente(BigInteger cpf, String nome, String telefone, String enredeçoEntrega, GregorianCalendar dataNascimento, GregorianCalendar dataCadastro) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.enredeçoEntrega = enredeçoEntrega;
        this.dataNascimento = dataNascimento;
        this.dataCadastro = dataCadastro;
    }


    public BigInteger getCpf() {
        return cpf;
    }


    public void setCpf(BigInteger cpf) {
        this.cpf = cpf;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getTelefone() {
        return telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public String getEnredeçoEntrega() {
        return enredeçoEntrega;
    }


    public void setEnredeçoEntrega(String enredeçoEntrega) {
        this.enredeçoEntrega = enredeçoEntrega;
    }


    public GregorianCalendar getDataNascimento() {
        return dataNascimento;
    }


    public void setDataNascimento(GregorianCalendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    public GregorianCalendar getDataCadastro() {
        return dataCadastro;
    }


    public void setDataCadastro(GregorianCalendar dataCadastro) {
        this.dataCadastro = dataCadastro;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.cpf);
        return hash;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        return Objects.equals(this.cpf, other.cpf);
    }


    @Override
    public String toString() {
        return "Cliente{" + "cpf=" + cpf + ", nome=" + nome + ", telefone=" + telefone + ", enrede\u00e7oEntrega=" + enredeçoEntrega + ", dataNascimento=" + dataNascimento + ", dataCadastro=" + dataCadastro + '}';
    }
   
}
