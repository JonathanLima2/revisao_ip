import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

//classe abstrata original
abstract class animal 
{
    public String raca;
    public String genero;
    animal(String r, String g)
    {
        this.setRaca(r);
        this.setGen(g);
    }
    void setRaca(String r){this.raca = r;}
    void setGen(String g){this.genero = g;}

    String getRaca(){return this.raca;}
    String getGen(){return this.genero;}

    boolean isAnimal(String r)
    {
        return r==this.getRaca()? true:false;
    }
}

//classe herdeira de animal
class gato extends animal{
    private String miado;
    gato(String r, String g, String m){
        super(r, g);
        this.setMiado(m);
    }
    void setMiado(String m){this.miado = m;}

    String getMiado(){return this.miado;}

    void som ()
    {
        System.out.println(miado);
    }
    boolean filhos(gato cat)
    {
        return !this.getGen().equals(cat.getGen())? true:false;
    }
    void id()
    {
        System.out.println(this.getRaca());
        System.out.println(this.getGen());
        System.out.println(this.getMiado());
    }
}

//classe herdeira de animal
class cachorro extends animal{
    private String latido;
    cachorro(String r, String g, String l){
        super(r, g);
        this.setLatido(l);
    }

    void setLatido(String l){this.latido = l;}

    String getLatido(){return this.latido;}

    void som()
    {
        System.out.println(latido);
    }

    boolean filhos(cachorro dog)
    {
        return !this.getGen().equals(dog.getGen())? true:false;
    }

    void id()
    {
        System.out.println(this.getRaca());
        System.out.println(this.getGen());
        System.out.println(this.getLatido());
    }
}

public class heranca{
    public static void main(String[]args) throws FileNotFoundException{
        Scanner arquivo = new Scanner(new FileReader("/home/jonathan/projetos/Monitoria/Revisão/heranca+poli/animais.txt"));
        String r, g, ml;
        gato cat1, cat2;
        cachorro dog1, dog2;
        r = arquivo.nextLine();
        g = arquivo.nextLine();
        ml = arquivo.nextLine();
        cat1 = new gato(r, g, ml);
        r = arquivo.nextLine();
        g = arquivo.nextLine();
        ml = arquivo.nextLine();
        cat2 = new gato(r, g, ml);
        r = arquivo.nextLine();
        g = arquivo.nextLine();
        ml = arquivo.nextLine();
        dog1 = new cachorro(r, g, ml);
        r = arquivo.nextLine();
        g = arquivo.nextLine();
        ml = arquivo.nextLine();
        dog2 = new cachorro(r, g, ml);
        dog1.id();
        System.out.println();
        dog2.id();
        System.out.println();
        cat1.id();
        System.out.println();
        cat2.id();
        //System.out.println(cat1.filhos(cat2));
        //System.out.println(dog1.filhos(dog2));
        arquivo.close();
    }
}