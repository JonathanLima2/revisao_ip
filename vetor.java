import java.util.Scanner;
import java.util.ArrayList;

public class vetor
{
    static void vet(Scanner s)
    {
        int[] vet;
        int entrada,i;
        entrada =s.nextInt();
        vet = new int[entrada];
        for(i=0;i<=vet.length;i++)
        {
            entrada=s.nextInt();
            vet[i]=entrada;
        }
        System.out.printf("tamanho: "+vet.length+", itens:");
        for(i=0;i<vet.length;i++)
        {
            System.out.printf(" "+vet[i]);
        }
        System.out.println();
    }
    static void vetList(Scanner s)
    {
        ArrayList<Integer> vet = new ArrayList<Integer>();
        int i, entrada, tam;
        tam = s.nextInt();
        for(i=0;i<tam;i++)
        {
            entrada =s.nextInt();
            vet.add(entrada);
        }
        System.out.println("tamanho: "+vet.size()+", itens: "+vet.toString());
        tam = s.nextInt();
        for(i=0;i<tam;i++)
        {
            entrada =s.nextInt();
            vet.add(entrada);
        }
        System.out.println("Novo tamanho: "+vet.size()+", itens: "+vet.toString());
    }
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        //vetList(s);
        vet(s);
        s.close();
    }
}