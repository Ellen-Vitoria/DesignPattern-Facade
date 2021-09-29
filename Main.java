public class Main {
    public static void main(String[] args){
        //Primeiro Combo
        Combo cmb1 = new Combo(1);
        cmb1.criarCombo(4,"Macarronada      ", 5.0);
        cmb1.criarCombo(2,"Bolo de Chocolate", 3.0);
        cmb1.criarCombo(1,"Água sem Gás     ", 1.0);
        cmb1.mostrarCombo();

        //Segundo Combo
        Combo cmb2 = new Combo(2);
        cmb2.criarCombo(1,"Arroz e Feijão", 5.0);
        cmb2.criarCombo(3,"Torta de Limão", 4.0);
        cmb2.criarCombo(2,"Suco Natural  ", 4.0);
        cmb2.mostrarCombo();
    }
}