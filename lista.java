import java.util.Scanner;

class no{
    public int valor;
    public no prox;
    public no ant;
}

class list{
    no inicio, fim;
    list()
    {
        inicio = fim = null;
    }
    void close()
    {
        no aux=fim; 
        no aux2;
        while(aux!=null)
        {
            aux2=aux;
            aux=aux2.prox;
            aux2 = null;
        }
    }
    boolean vazia()
    {
        return inicio==null? true:false;
    }
    void push(int val)
    {
        no aux = new no();
        aux.valor = val;
        aux.prox = null;
        if(!vazia())
        {
            fim.prox = aux;
            fim = aux;
        }else{
            inicio = aux;
            fim = aux;
        }	
    }

}

public class lista {
    public static void main (String[]args){
        Scanner s = new Scanner(System.in);
        s.close();
    }
}
