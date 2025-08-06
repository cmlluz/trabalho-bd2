package ifba.edu;

import java.io.Serializable;

public class Produtos implements Serializable {
    private TipoProdutos produto;

    public Produtos(TipoProdutos produto) {
        this.produto = produto;
    }

    public TipoProdutos getProduto() {
        return produto;
    }

    @Override
    public String toString() {
        return "Produtos [produto=" + produto + ", toString()=" + super.toString() + "]";
    }

}
