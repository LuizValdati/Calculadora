package trabalho1;

public class ListaEncadeadaGenerica<Item> {
    
    private Nodo<Item> ultimo;

    private static class Nodo<Item>{
        Item dado;
        Nodo<Item> ant;
    }

    public ListaEncadeadaGenerica(){
        ultimo = null;
    }

    public void insereFinal(Item n){
        Nodo<Item> novo = new Nodo<>();
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

    public Item removeFinal(){
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

    public void imprimeLista(){
        Nodo<Item> temp = ultimo;
        while(temp != null){
            System.out.print(temp.dado + "->");
            temp = temp.ant;
        }
        System.out.println();
    }
}
