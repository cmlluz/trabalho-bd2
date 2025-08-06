package ifba.edu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CTransacao {
    public static List<Transacao> carregarTransacoes() {
        List<Transacao> transacoes = new ArrayList<>();

        // TID 1
        Map<TipoProdutos, Produtos> t1 = new HashMap<>();
        t1.put(TipoProdutos.CAFE, new Produtos(TipoProdutos.CAFE));
        t1.put(TipoProdutos.PAO, new Produtos(TipoProdutos.PAO));
        t1.put(TipoProdutos.MANTEIGA, new Produtos(TipoProdutos.MANTEIGA));
        transacoes.add(new Transacao(t1));

        // TID 2
        Map<TipoProdutos, Produtos> t2 = new HashMap<>();
        t2.put(TipoProdutos.LEITE, new Produtos(TipoProdutos.LEITE));
        t2.put(TipoProdutos.CERVEJA, new Produtos(TipoProdutos.CERVEJA));
        t2.put(TipoProdutos.PAO, new Produtos(TipoProdutos.PAO));
        t2.put(TipoProdutos.MANTEIGA, new Produtos(TipoProdutos.MANTEIGA));
        transacoes.add(new Transacao(t2));

        // TID 3
        Map<TipoProdutos, Produtos> t3 = new HashMap<>();
        t3.put(TipoProdutos.CAFE, new Produtos(TipoProdutos.CAFE));
        t3.put(TipoProdutos.PAO, new Produtos(TipoProdutos.PAO));
        t3.put(TipoProdutos.MANTEIGA, new Produtos(TipoProdutos.MANTEIGA));
        transacoes.add(new Transacao(t3));

        // TID 4
        Map<TipoProdutos, Produtos> t4 = new HashMap<>();
        t4.put(TipoProdutos.LEITE, new Produtos(TipoProdutos.LEITE));
        t4.put(TipoProdutos.CAFE, new Produtos(TipoProdutos.CAFE));
        t4.put(TipoProdutos.PAO, new Produtos(TipoProdutos.PAO));
        t4.put(TipoProdutos.MANTEIGA, new Produtos(TipoProdutos.MANTEIGA));
        transacoes.add(new Transacao(t4));

        // TID 5
        Map<TipoProdutos, Produtos> t5 = new HashMap<>();
        t5.put(TipoProdutos.CERVEJA, new Produtos(TipoProdutos.CERVEJA));
        transacoes.add(new Transacao(t5));

        // TID 6
        Map<TipoProdutos, Produtos> t6 = new HashMap<>();
        t6.put(TipoProdutos.MANTEIGA, new Produtos(TipoProdutos.MANTEIGA));
        transacoes.add(new Transacao(t6));

        // TID 7
        Map<TipoProdutos, Produtos> t7 = new HashMap<>();
        t7.put(TipoProdutos.PAO, new Produtos(TipoProdutos.PAO));
        transacoes.add(new Transacao(t7));

        // TID 8
        Map<TipoProdutos, Produtos> t8 = new HashMap<>();
        t8.put(TipoProdutos.FEIJAO, new Produtos(TipoProdutos.FEIJAO));
        transacoes.add(new Transacao(t8));

        // TID 9
        Map<TipoProdutos, Produtos> t9 = new HashMap<>();
        t9.put(TipoProdutos.ARROZ, new Produtos(TipoProdutos.ARROZ));
        t9.put(TipoProdutos.FEIJAO, new Produtos(TipoProdutos.FEIJAO));
        transacoes.add(new Transacao(t9));

        // TID 10
        Map<TipoProdutos, Produtos> t10 = new HashMap<>();
        t10.put(TipoProdutos.ARROZ, new Produtos(TipoProdutos.ARROZ));
        transacoes.add(new Transacao(t10));

        return transacoes;
    }

    public static List<TipoProdutos> carregarProdutos() {
        List<TipoProdutos> produtos = new ArrayList<TipoProdutos>();

        produtos.add(TipoProdutos.LEITE);
        produtos.add(TipoProdutos.ARROZ);
        produtos.add(TipoProdutos.CAFE);
        produtos.add(TipoProdutos.CERVEJA);
        produtos.add(TipoProdutos.FEIJAO);
        produtos.add(TipoProdutos.MANTEIGA);
        produtos.add(TipoProdutos.PAO);

        return produtos;
    }
}
