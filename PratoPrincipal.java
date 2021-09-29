import java.util.ArrayList;
import java.util.List;

public class PratoPrincipal {
    List<Item> itens = new ArrayList<Item>();

    //Incluir cada item em um combo
    public void adicionar(Item item){
        itens.add(item);
    }

    //Mostrar informação de cada item
    public void mostrarItens(){
        for(Item item: itens){
            System.out.println("Cod: " + item.getCodigo() +
                    "\t\tDesc: " + item.getDescricao() +
                    "\t\tPreço: R$ " + item.getPreco());
        }
    }

    public void Remover(){}
}