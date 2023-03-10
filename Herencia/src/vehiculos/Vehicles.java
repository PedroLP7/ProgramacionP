package vehiculos;

public abstract class Vehicles {
    protected String id;
    protected boolean electric;

protected int capacidad;

    public Vehicles() {
    }

    public Vehicles(String id, boolean electric, int capacidad) {
        this.id = id;
        this.electric = electric;

        this.capacidad = capacidad;

    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }
}
