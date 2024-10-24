package trabalho1;

public class PilhaGenerica<Item> {
    private ListaEncadeadaGenerica<Item> pilha;
    int qt = 0;

    PilhaGenerica(){
        pilha = new ListaEncadeadaGenerica<Item>();
    }

    void empilha(Item n){
        pilha.insereFinal(n);
        qt++;
    }

    Item desempilha(){
        qt--;
        return pilha.removeFinal();
    }

    void imprimePilha(){
        pilha.imprimeLista();
    }

    int getQt(){
        return qt;
    }
}
