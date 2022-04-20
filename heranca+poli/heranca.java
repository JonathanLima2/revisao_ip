import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

//classe abstrata original
class animal 
{
    public String raca;
    public String genero;
    animal(String r, String g)
    {
        this.setRaca(r);
        this.setGen(g);
    }
    //animal(){}
    void setRaca(String r){this.raca = r;}
    void setGen(String g){this.genero = g;}

    String getRaca(){return this.raca;}
    String getGen(){return this.genero;}
}

//interface de metodos comuns
interface bichos{
    public void som(); 
}

//classe herdeira de animal
class gato extends animal implements bichos{
    private String miado;
    gato(String r, String g, String m){
        super(r, g);
        this.setMiado(m);
    }
    //gato(){}
    void setMiado(String m){this.miado = m;}
    String getMiado(){return this.miado;}

    boolean isGato(animal a){return a.getRaca()=="gato"? true:false; }
    public void barulho(bichos b)
    {   

        b.som();
    }
    public void som ()
    {
        System.out.println(miado);
    }
    //polimorfismo por interface

    public boolean filhos(gato cat)
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
class cachorro extends animal implements bichos{
    private String latido;
    cachorro(String r, String g, String l){
        super(r, g);
        this.setLatido(l);
    }
    //cachorro(){}
    void setLatido(String l){this.latido = l;}
    String getLatido(){return this.latido;}
    boolean isCao(animal a){return a.getRaca()=="cachorro"? true:false; }
    public void barulho(bichos b)
    {   
            b.som();
    }
    public void som()
    {
        System.out.println(latido);
    }

    public boolean filhos(cachorro dog)
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
        gato cat;
        cachorro dog;
        animal a;
        //inicializa gato
        r = arquivo.nextLine();
        g = arquivo.nextLine();
        ml = arquivo.nextLine();
        cat = new gato(r, g, ml);
        //inicializa cachorro
        r = arquivo.nextLine();
        g = arquivo.nextLine();
        ml = arquivo.nextLine();
        dog = new cachorro(r, g, ml);
        //inicializa um animal
        r = arquivo.nextLine();
        g = arquivo.nextLine();
        a = new animal(r, g);
        dog.id();
        System.out.println();
        cat.id();
        System.out.println();
        //System.out.println(cat1.filhos(cat2));
        //System.out.println(dog1.filhos(dog2));
        arquivo.close();
    }
}