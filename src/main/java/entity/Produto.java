package entity;


import java.util.GregorianCalendar;
import java.util.Objects;


public class Produto {
    Integer codigo;
    String descricao;
    Double Preco;
    Integer quantidadeEstoque;
    GregorianCalendar dataCadastro;


    public Produto() {
    }


    public Produto(Integer codigo, String descricao, Double Preco, Integer quantidadeEstoque, GregorianCalendar dataCadastro) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.Preco = Preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.dataCadastro = dataCadastro;
    }


    public Integer getCodigo() {
        return codigo;
    }


    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }


    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public Double getPreco() {
        return Preco;
    }


    public void setPreco(Double Preco) {
        this.Preco = Preco;
    }


    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }


    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }


    public GregorianCalendar getDataCadastro() {
        return dataCadastro;
    }


    public void setDataCadastro(GregorianCalendar dataCadastro) {
        this.dataCadastro = dataCadastro;
    }


    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", descricao=" + descricao + ", Preco=" + Preco + ", quantidadeEstoque=" + quantidadeEstoque + ", dataCadastro=" + dataCadastro + '}';
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.codigo);
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
        final Produto other = (Produto) obj;
        return Objects.equals(this.codigo, other.codigo);
    }  
   
}
