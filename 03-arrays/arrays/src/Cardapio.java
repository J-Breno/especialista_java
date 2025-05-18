import java.util.ArrayList;

public class Cardapio {
    ArrayList<ItemCardapio> itens = new ArrayList<>();

    void adicionarItem(ItemCardapio item) {
        itens.add(item);
    }

    void removerItem(ItemCardapio item) {
        itens.remove(item);
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        for(ItemCardapio item : itens) {
            if(item.possuiPrecoEntre(precoMinimo, precoMinimo)) {
                item.imprimir();
            }
        }
    }

    ArrayList<ItemCardapio> consultarItensPorPreco(double precoMinimo, double precoMaximo) {
        ArrayList<ItemCardapio> itensEncontrados = new ArrayList<>();
        for(ItemCardapio item : itens) {
            if(item.possuiPrecoEntre(precoMinimo, precoMinimo)) {
                itensEncontrados.add(item);
            }
        }

            return itensEncontrados;
        }
}
