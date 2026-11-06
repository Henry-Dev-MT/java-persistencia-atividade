import java.util.List;
public class Main {
    public static void main(String[] args) {
        System.out.println("=====Henrique Mr AURA=====");
        Produtos produtos1 = new Produtos("Ração para Cachorro", "Alimento para Pet", 129.00);
        Produtos produtos2 = new Produtos("Vassoura", "Limpeza", 59.90);
        Produtos produtos3 = new Produtos("Frango Congelado", "Frios", 49.00);


        System.out.println("--- Gravação dos Produtos ---");
        GerenciadorProduto.salvarProduto(produtos1);
        GerenciadorProduto.salvarProduto(produtos2);
        GerenciadorProduto.salvarProduto(produtos3);
        System.out.println();


        System.out.println("--- Leitura dos Produtos ---");
        List<Produtos> produtosDoArquivo = GerenciadorProduto.carregarProdutos();
        for (Produtos a : produtosDoArquivo) {
            System.out.println(a);
        }
    }
}