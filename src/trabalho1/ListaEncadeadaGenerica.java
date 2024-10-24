package trabalho1;

public class ListaEncadeadaGenerica<Item> {
    
    Nodo ultimo;

    private class Nodo{
        Item dado;
        Nodo ant;
    }

    ListaEncadeadaGenerica(){
        ultimo = null;
    }

    void insereFinal(Item n){
        Nodo novo = new Nodo();
        novo.dado = n;
        
        if(ultimo == null){
            novo.ant = null;
            ultimo = novo;
        }
        else{
            novo.ant = ultimo;
            ultimo = novo;
        }

    }

    Item removeFinal(){
        if(ultimo != null){
            Item n = ultimo.dado;
            if(ultimo.ant == null){
                ultimo = null;
            }
            else{
                ultimo = ultimo.ant;
            }
            return n;
        }
        else{
            return null;
        }
    }

    void imprimeLista(){
        Nodo temp = ultimo;
        while(temp != null){
            System.out.print(temp.dado + "->");
            temp = temp.ant;
        }
        System.out.println();
    }
}
