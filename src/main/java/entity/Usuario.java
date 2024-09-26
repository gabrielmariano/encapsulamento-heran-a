package entity;


import java.math.BigInteger;
import java.util.GregorianCalendar;
import java.util.Objects;
import view.FormatarData;


public class Usuario {
    private BigInteger cpf;
    private String nome;
    private String telefone;
    private String perfil;
    private GregorianCalendar dataCadastro;    


    public Usuario() {
    }


    public Usuario(BigInteger cpf, String nome, String telefone, String perfil) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.perfil = perfil;
        this.dataCadastro = new GregorianCalendar();
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


    public String getPerfil() {
        return perfil;
    }


    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }


    public GregorianCalendar getDataCadastro() {
        return dataCadastro;
    }


    public void setDataCadastro(GregorianCalendar dataCadastro) {
        this.dataCadastro = dataCadastro;
    }


    @Override
    public String toString() {
        return "Usuario{" + "cpf=" + cpf + ", nome=" + nome + ", telefone=" + telefone + ", perfil=" + perfil + ", dataCadastro=" + FormatarData.formatarData(dataCadastro) + '}';
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.cpf);
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
        final Usuario other = (Usuario) obj;
        return Objects.equals(this.cpf, other.cpf);
    }  
}
