package ifba.edu;
import java.util.Map;

public class Transacao {
    private Map<TipoProdutos,Produtos> transacao;

    public Transacao(Map<TipoProdutos,Produtos> transacao) {
        this.transacao = transacao;
    }

     public Boolean hasProduto(TipoProdutos chave) {
        return transacao.containsKey(chave);
    }
}
