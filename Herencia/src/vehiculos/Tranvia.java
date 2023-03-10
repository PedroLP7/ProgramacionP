package vehiculos;

public class Tranvia extends Vehicles implements electric{

private String linea;
    private double porcentajbateria;



    public Tranvia(String id, boolean electric, int capacidad, String linea, double porcentajbateria) {
        super(id, electric, capacidad);
        this.linea = linea;
        this.porcentajbateria = porcentajbateria;
    }

    public String getLinea() {
        return this.linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    @Override
    public void duracionbateria() {
        System.out.println("bateria de reserva 1h");

    }
@Override
    public void cambiarBateria() {
        System.out.println("cambiando la bateria...");
        this.setPorcentajbateria(100);
        System.out.println("bateria cargada: "+porcentajbateria+"%");

    }


    public double getPorcentajbateria() {
        return this.porcentajbateria;
    }

    public void setPorcentajbateria(double porcentajbateria) {
        this.porcentajbateria = porcentajbateria;
    }


    @Override
    public String toString() {
        return "Tranvia{" +
                "linea='" + linea + '\'' +
                ", porcentajbateria=" + porcentajbateria +
                ", id='" + id + '\'' +
                ", electric=" + electric +
                ", capacidad=" + capacidad ;
    }
}
