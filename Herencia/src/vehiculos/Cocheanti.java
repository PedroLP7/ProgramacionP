package vehiculos;

public class Cocheanti extends Vehicles implements carburante {





    private int carburant;

    private String contaminacion;



    public Cocheanti(String id, boolean electric, int capacidad, int carburant, String contaminacion) {
        super(id, electric, capacidad);
        this.carburant = carburant;
        this.contaminacion = contaminacion;
    }

    public int getCarburant() {
        return carburant;
    }

    public void setCarburant(int carburant) {
        this.carburant = carburant;
    }

    public String getContaminacion() {
        return contaminacion;
    }

    public void setContaminacion(String contaminacion) {
        this.contaminacion = contaminacion;
    }

    @Override
    public void calcularaceleracion() {
        System.out.println("acceleracion de un coche antiguo");

    }

    @Override
    public void grethathumberg() {

        System.out.println("ni habia nacido la muchacha esta todavia");

    }
}
