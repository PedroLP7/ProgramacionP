package abstracto;

public class Circulo extends FiguraG {
private int radio;
private int  diametro;


    public Circulo(int costats, int radio, int diametro) {
        super(costats);
        this.radio = radio;
        this.diametro = diametro;
    }

    @Override
    public double calcularea() {

       double resultado=(radio*radio)*pi;

        return resultado;
    }

    @Override
    public double calculperimetro() {

        double resultado = pi*diametro;


        return resultado;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", diametro=" + diametro +
                '}';
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public double getPi() {
        return this.pi;
    }


}
