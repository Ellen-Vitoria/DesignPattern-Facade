public class Combo {
    private Item item;
    private PratoPrincipal prato;

    //Método Construtor
    public Combo(int cmb) {
        System.out.println("Combo " + cmb);
        prato = new PratoPrincipal();
    }

    //Acessando outras classes para criar Combo
    public void criarCombo(int cd, String desc, double preco) {
        item = new Item();
        item.setCodigo(cd);
        item.setDescricao(desc);
        item.setPreco(preco);
        prato.adicionar(item); //prato.itens.add(item);
    }

    //Mostrando items do Combo através de PratoPrincipal
    public void mostrarCombo() {
        prato.mostrarItens();
        System.out.println("\n");
    }
}