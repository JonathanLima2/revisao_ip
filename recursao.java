import java.util.Scanner;

class recursao{

// troca duas letras de lugar uma com a outra
    private static void troca(char[]str, int l, int h)
    {
        char aux = str[l];
        str[l] = str[h];
        str[h] = aux;
    }
// realiza o fatorial de um numero n recursivamente
    public static int fatorial(int n)
    {
        if(n<=1)
        {
            return 1;
        }else{
            return n*fatorial(n-1);
        }
    }
//  inverte uma frase do teclado recursivamente
    public static char[] reverso(char[] str, int l, int h)
    {
        if (l < h)
        {
            troca(str,l,h);
            str = reverso(str, l + 1, h - 1);
        }
        return str;
    }
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        char[] f;
        String entrada,saida;
/*
        entrada = s.nextLine();
        f = entrada.toCharArray();
        f = reverso(f, 0, f.length-1);
        saida = new String(f);
        System.out.println(saida);*/

        System.out.println(fatorial(s.nextInt()));
        s.close();
    }
    
}
