package ifba.edu;

import java.io.Serializable;
import java.util.Map;

public class Transacao implements Serializable {

    private Map<TipoProdutos, Produtos> transacao;

    public Transacao(Map<TipoProdutos, Produtos> transacao) {
        this.transacao = transacao;
    }

    public Boolean hasProduto(TipoProdutos chave) {
        return transacao.containsKey(chave);
    }
}
