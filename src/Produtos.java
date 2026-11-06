public class Produtos {
    private String nome;
    private String categoria;
    private double preco;

    public Produtos(String nome, String categoria, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }
        @Override
        public String toString() {
            return "Nome: " + nome +
                    ", Categoria: " + categoria +
                    ", Preço: " + preco;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String toCSV() {
        return this.nome + ";" + this.categoria + ";" + this.preco;
    }
    public static Produtos fromCSV(String linha) {
        String[] dados = linha.split(";");
        String nome = dados[0];
        String categoria = dados[1];
        double preco = Double.parseDouble(dados[2]);
        return new Produtos(nome, categoria, preco);
    }

}
