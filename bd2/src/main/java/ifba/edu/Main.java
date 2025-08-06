package ifba.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Transacao> transacoes = new ArrayList<>();
        List<TipoProdutos> produtos = new ArrayList<>();

        Serializacao.carregar(transacoes, produtos);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o suporte mínimo: ");
        double valorSuporte = scanner.nextDouble();

        System.out.print("Digite a confiança mínima: ");
        double valorConfianca = scanner.nextDouble();

        System.out.println();

        for (int i = 0; i < produtos.size(); i++) {

            for (int j = i + 1; j < produtos.size(); j++) {

                int countI = 0;
                int countJ = 0;
                int countIJ = 0;

                for (var transacao : transacoes) {
                    if (transacao.hasProduto(produtos.get(i)))
                        countI++;
                    if (transacao.hasProduto(produtos.get(j)))
                        countJ++;
                    if (transacao.hasProduto(produtos.get(i)) && transacao.hasProduto(produtos.get(j)))
                        countIJ++;
                }

                double suporte = (double) countIJ / transacoes.size();
                if (suporte >= valorSuporte) {
                    System.out.println(produtos.get(i).toString() + " " + produtos.get(j).toString());
                    System.out.println("Suporte: " + suporte);
                    double confiancaIJ = (double) countIJ / countI;
                    double confiancaJI = (double) countIJ / countJ;

                    if (confiancaIJ >= valorConfianca) {
                        System.out.println(produtos.get(i).toString() + " -> " + produtos.get(j).toString());
                        System.out.println("Confiança: " + confiancaIJ);
                    }
                    if (confiancaJI >= valorConfianca) {
                        System.out.println(produtos.get(j).toString() + " -> " + produtos.get(i).toString());
                        System.out.println("Confiança: " + confiancaJI);
                    }
                }
            }
        }
        scanner.close();
        Serializacao.grava(transacoes, produtos);
    }
}
