package entity;


import java.math.BigInteger;
import java.util.GregorianCalendar;
import java.util.Objects;
import view.FormatarData;


public class Funcionario extends Usuario{
    private BigInteger matricula;    
    private GregorianCalendar dataAdmissao;


    public Funcionario() {
    }


    public Funcionario(BigInteger matricula, GregorianCalendar dataAdmissao) {
        this.matricula = matricula;
        this.dataAdmissao = dataAdmissao;
    }


    public BigInteger getMatricula() {
        return matricula;
    }


    public void setMatricula(BigInteger matricula) {
        this.matricula = matricula;
    }


    public GregorianCalendar getDataAdmissao() {
        return dataAdmissao;
    }


    public void setDataAdmissao(GregorianCalendar dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }


    @Override
    public String toString() {
        return "Funcionario{" + "matricula=" + matricula + ", dataAdmissao=" + FormatarData.formatarData(dataAdmissao) + '}';
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.matricula);
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
        final Funcionario other = (Funcionario) obj;
        return Objects.equals(this.matricula, other.matricula);
    }
       
}
