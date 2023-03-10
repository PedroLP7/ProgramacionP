package abstracto;

public interface FiguraGe {


     int costats = 0;
    public final static double pi = Math.PI;

    public double getPi();


    double calcularea();

    double calculperimetro();

    int getCostats();

    void setCostats(int costats);

    @Override
    String toString();


}
