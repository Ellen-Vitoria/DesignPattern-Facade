public class Item {
    private int codigo;
    private String descricao;
    private double preco;

    //Método Set
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    //Método Get
    public int getCodigo() {
        return codigo;
    }
    public double getPreco() {
        return preco;
    }
    public String getDescricao() {
        return descricao;
    }
}