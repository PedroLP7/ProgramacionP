package redime;


import java.util.Scanner;

public class Rectangulo implements Redimensionable {
    private int largo;
    private int ancho;
    private int costat1;
    private int costat2;
    private int costat3;
    private int costat4;

    public Rectangulo(int largo, int ancho, int costat1, int costat2, int costat3, int costat4) {

        this.largo = largo;
        this.ancho = ancho;
        this.costat1 = costat1;
        this.costat2 = costat2;
        this.costat3 = costat3;
        this.costat4 = costat4;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }


    public double calcularea() {
        double resultado= largo*ancho;
        return resultado;
    }


    public double calculperimetro() {
        double resultado= costat1+costat2+costat3+costat4;
        return resultado;
    }


    @Override
    public String toString() {
        return "Rectangulo{" +
                "largo=" + largo +
                ", ancho=" + ancho +
                ", costat1=" + costat1 +
                ", costat2=" + costat2 +
                ", costat3=" + costat3 +
                ", costat4=" + costat4 +
                '}';
    }






    @Override
    public void reduciraMitad() {
        int reducido= this.largo/2;
        System.out.println("largo original   "+largo+"largo reducido  "+reducido);
    }

    @Override
    public void aumentar(int n) {
        Scanner data = new Scanner(System.in);

         int ampliacion =this.largo*n;
        System.out.println("largo original   "+largo+"largo ampliado  "+ampliacion);

    }
}

