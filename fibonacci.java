import java.util.Scanner;

public class fibonacci{
    //imprime os valores até n da sequencia de fibonacci
    static void fibo(int n){
        int ant=0;
        int prox=1;
        int soma=ant+prox;
        if(n==0){
            System.out.print(ant);
        }  
        if (n>=1)
        {
            System.out.print(ant+" "+prox);
        }
        while(soma < n)
        {
            System.out.printf(" "+soma);
            ant =prox;
            prox =soma;
            soma =ant+prox;
        }
        System.out.println();
    }
    //imprime os n valores da sequência de fibonacci
    static void fibon(int n){
        int i=1;
        int ant=0;
        int prox=1;
        int soma= ant+prox;
        
        if(n==0){
            System.out.print(ant);
        }
        if(n>=1){
            System.out.print(ant+" "+prox);
        }

        for (; i<n;i++)
        {
            soma= ant+prox;
            System.out.printf(" "+soma);
            ant=prox;
            prox=soma;
        }
        System.out.println();
    }
    //retorna o valor da sequência n de fibonacci
    static int fiboR(int n){
        if (n <= 1)
            return n;
        return fiboR(n-1) + fiboR(n-2);
    }
/*OBS: 0 não conta na operação, sendo considerado "fora" da sequência de execução, logo, a contagem se inicia em 1
  mas ele ainda é necessário para a apresentação da saída. Quem considera ou não se inicia nele é o autor da questão*/
    public static void main (String[]args)
    {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        fibo(n);
        fibon(n);
        System.out.println(fiboR(n));
        s.close();
    }
}