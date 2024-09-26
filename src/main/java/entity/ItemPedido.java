
package entity;

import java.util.Objects;


public class ItemPedido {
    Pedido pedido;
    Integer quantidadeCarrinho;
    Produto produto;

    public ItemPedido() {
    }

    public ItemPedido(Pedido pedido, Integer quantidadeCarrinho, Produto produto) {
        this.pedido = pedido;
        this.quantidadeCarrinho = quantidadeCarrinho;
        this.produto = produto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Integer getQuantidadeCarrinho() {
        return quantidadeCarrinho;
    }

    public void setQuantidadeCarrinho(Integer quantidadeCarrinho) {
        this.quantidadeCarrinho = quantidadeCarrinho;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "ItemPedido{" + "pedido=" + pedido + ", quantidadeCarrinho=" + quantidadeCarrinho + ", produto=" + produto + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final ItemPedido other = (ItemPedido) obj;
        if (!Objects.equals(this.pedido, other.pedido)) {
            return false;
        }
        return Objects.equals(this.produto, other.produto);
    }
    
    
    
    
}
