package trabalho1;

public class TestaListaEncadeadGenerica<Item> {

    public static void main(String[] args) {
        
        ListaEncadeadaGenerica<Integer> lista = new ListaEncadeadaGenerica<Integer>();

        lista.insereFinal(78);
        lista.insereFinal(9);
        lista.insereFinal(44);
        lista.imprimeLista();
        lista.removeFinal();
        lista.imprimeLista();
    }

}
