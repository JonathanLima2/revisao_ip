import java.util.Scanner;
import java.io.*;
import vetor.java;


public class matriz{
//cria uma matriz nxm    
    static int[][] mat(int n, int m)
    {
        int[][] mat = new int[n][m];
        return mat;
    }
//cria uma matriz de ordem n
    static int[][] mat(int n)
    {
        int[][] mat = new int[n][n];
        return mat;
    }
//insere valores na matriz de tamanho nxm
    static void fill(int[][]mat, int n, int m, Scanner arquivo)
    {
        int i, j;
        for (i=0;i<n; i++)
        {
            for(j=0;j<m;j++)
            {
                mat[i][j] = arquivo.nextInt();
            }
        }
    }
//insere valores na matriz de ordem n
    static void fill(int[][]mat, int n, Scanner arquivo)
    {
        int i, j;
        for (i=0;i<n; i++)
        {
            for(j=0;j<n;j++)
            {
                mat[i][j] = arquivo.nextInt();
            }
        }
    }
//imprime a matriz de tamanho nxm
    static void print(int[][] mat, int n, int m)
    {
        int i, j;
        for (i=0;i<n; i++)
        {
            for(j=0;j<m;j++)
            {
                //System.out.println(mat[j][i]+" ");---------------imprime coluna por coluna 
                System.out.printf(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
//imprime a matriz de ordem n
    static void print(int[][] mat, int n)
    {
        int i, j;
        for (i=0;i<n; i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.printf(mat[i][j]+" ");
                /*if(i==j)
                {
                    System.out.println(mat[i][j]);------------------imprime diagonal principal
                }
                if(i+j==tam-1)
                {
                    System.out.println(mat[i][j]);------------------imprime diagonal secundária
                }
                */
            }
            System.out.println();
        }
    }
    public static void main(String[]args) throws FileNotFoundException {
        //o caminho do arquivo matriz.txt depende de onde vc rodar o programa, pra saber onde ele está use pwd no terminal
        String entrada = "/home/jonathan/projetos/Monitoria/Revisão/matriz.txt";
        Scanner arquivo = new Scanner(new FileReader(entrada));
        int n = arquivo.nextInt();
        int m = arquivo.nextInt();
        int[][] mat = mat(n,m);
        fill(mat, n, m, arquivo);
        print(mat, n, m);

        n=arquivo.nextInt();
        mat = mat(n);
        fill(mat, n, arquivo);
        print(mat,n);
        arquivo.close();
    }
}