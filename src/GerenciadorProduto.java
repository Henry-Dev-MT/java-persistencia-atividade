import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorProduto {
    private static final String CAMINHO_ARQUIVO = "Produtos.java";

    public static void salvarProduto(Produtos produtos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CAMINHO_ARQUIVO, true))) {
            writer.write(produtos.toCSV());
            writer.newLine();
            System.out.println("Produto salvo com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao salvar o Produto no arquivo: " + e.getMessage());
        }
    }

    public static List<Produtos> carregarProdutos() {
        List<Produtos> listaProdutos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(CAMINHO_ARQUIVO))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                if (!linha.trim().isEmpty()) {
                    Produtos produtos = Produtos.fromCSV(linha);
                    listaProdutos.add(produtos);
                }
            }
        } catch (IOException e) {
            System.err.println("Aviso: Não foi possível ler o arquivo ou ele ainda não existe. (" + e.getMessage() + ")");
        }
        return listaProdutos;
    }
}