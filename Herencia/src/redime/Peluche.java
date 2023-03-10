package redime;

public class Peluche implements Redimensionable {

    private String nom;
    private int altura;
    private int anchura;


    @Override
    public void reduciraMitad() {
        int nalto =this.altura/2;
        int nancho=this.anchura/2;
        System.out.println("altura base :"+this.altura  +   "   altura nueva : "+ nalto);
        System.out.println("anchura base :"+this.anchura  +   "   anchura nueva : "+ nancho);


    }

    @Override
    public void aumentar(int n) {
        int nalto=this.altura*n;
        int nancho=this.anchura*n;
        System.out.println("altura base :"+this.altura  +   "   altura nueva : "+ nalto);
        System.out.println("anchura base :"+this.anchura  +   "   anchura nueva : "+ nancho);

    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    public Peluche( String nom, int altura, int anchura) {

        this.nom = nom;
        this.altura = altura;
        this.anchura = anchura;
    }
}
