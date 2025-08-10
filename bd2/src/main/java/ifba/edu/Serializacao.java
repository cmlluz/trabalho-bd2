package ifba.edu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Serializacao {
    public static void grava(DataBase db) {
        try (FileOutputStream fOut = new FileOutputStream("produto.bin");
                ObjectOutputStream oOut = new ObjectOutputStream(fOut)) {
            oOut.writeObject(db);
        } catch (Exception e) {
            System.out.println("Deu erro!");
        }
    }

    public static DataBase carregar() {
        try (FileInputStream fOut = new FileInputStream("produto.bin");
                ObjectInputStream oOut = new ObjectInputStream(fOut)) {
            DataBase db = (DataBase) oOut.readObject();
            return db;
        } catch (Exception e) {
            System.out.println("Deu erro!");
            return new DataBase(CTransacao.carregarTransacoes(), CTransacao.carregarProdutos());
        }
    }
}
