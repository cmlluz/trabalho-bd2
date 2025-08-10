package ifba.edu;

import java.io.Serializable;
import java.util.List;

public class DataBase implements Serializable {
    List<Transacao> transacoes;
    List<TipoProdutos> produtos;

    public DataBase(List<Transacao> transacoes, List<TipoProdutos> produtos) {
        this.transacoes = transacoes;
        this.produtos = produtos;
    }

    public void setTransacoes(List<Transacao> t) {
        transacoes = t;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public void setProdutos(List<TipoProdutos> p) {
        produtos = p;
    }

    public List<TipoProdutos> getProdutos() {
        return produtos;
    }
}