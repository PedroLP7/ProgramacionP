package abstracto;

// EJEMMPLO DE IMPLEMENTACION DE INTERFAZ PA QUE SEPA

public class Triangulo implements FiguraGe {
    private int base;
    private double altura ;

    private int costat1;
    private int costat2;
    private int costat3;
    private int costats;
    public Triangulo(int costats, int base, double altura, int costat1, int costat2, int costat3) {

        this.base = base;
        this.altura = altura;
        this.costat1 = costat1;
        this.costat2 = costat2;
        this.costat3 = costat3;
    }

    @Override
    public double getPi() {
        return pi;
    }

    @Override
    public double calcularea() {
        double resultado= (base*altura)/2;
        return resultado;
    }

    @Override
    public double calculperimetro() {


        int resultat= costat1+costat2+costat3;



        return resultat;
    }

    @Override
    public int getCostats() {
        return this.costats;
    }

    @Override
    public void setCostats(int costats) {
        this.costats = costats;

    }


    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }



    public int getCostat1() {
        return costat1;
    }

    public void setCostat1(int costat1) {
        this.costat1 = costat1;
    }

    public int getCostat2() {
        return costat2;
    }

    public void setCostat2(int costat2) {
        this.costat2 = costat2;
    }

    public int getCostat3() {
        return costat3;
    }

    public void setCostat3(int costat3) {
        this.costat3 = costat3;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +

                ", costat1=" + costat1 +
                ", costat2=" + costat2 +
                ", costat3=" + costat3 +
                ", costats=" + costats +
                '}';
    }
}
