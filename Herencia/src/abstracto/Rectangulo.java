package abstracto;

public class Rectangulo extends FiguraG{
private int largo;
private int ancho;
private int costat1;
private int costat2;
private int costat3;
private int costat4;

    public Rectangulo(int costats, int largo, int ancho, int costat1, int costat2, int costat3, int costat4) {
        super(costats);
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

    @Override
    public double calcularea() {
         double resultado= largo*ancho;
      return resultado;
    }

    @Override
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
}
