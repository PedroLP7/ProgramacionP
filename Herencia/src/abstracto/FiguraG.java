package abstracto;

public abstract class FiguraG {
    protected int costats;
    protected final static double pi =Math.PI;


    public double getPi() {
        return pi;
    }

    public FiguraG(int costats) {
        this.costats = costats;
    }

    public abstract double calcularea();
 public abstract double calculperimetro();

    public int getCostats() {
        return this.costats;
    }

    public void setCostats(int costats) {
        this.costats = costats;
    }

    @Override
    public String toString() {
        return "FiguraG{" +
                "costats=" + costats +
                '}';
    }

}
