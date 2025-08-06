package ifba.edu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Serializacao {
    public static void grava(List<Transacao> transacoes, List<TipoProdutos> produtos) {
        try (FileOutputStream fOut = new FileOutputStream("produto.ser");
                ObjectOutputStream oOut = new ObjectOutputStream(fOut)) {
            oOut.writeObject(transacoes);
            oOut.writeObject(produtos);
        } catch (Exception e) {
            System.out.println("Deu erro!");
        }
    }

    public static void carregar(List<Transacao> transacoes, List<TipoProdutos> produtos) {
        try (FileInputStream fOut = new FileInputStream("produto.ser");
                ObjectInputStream oOut = new ObjectInputStream(fOut)) {
            transacoes = (List<Transacao>) oOut.readObject();
            produtos = (List<TipoProdutos>) oOut.readObject();
        } catch (Exception e) {
            System.out.println("Deu erro!");
            transacoes.addAll(CTransacao.carregarTransacoes());
            produtos.addAll(CTransacao.carregarProdutos());
        }
    }
}
