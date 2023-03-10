package vehiculos;

import java.util.Random;

public class Bus extends Vehicles implements electric, carburante {
    private String zona;
    private int carburant;
    private double porcentajebateria;


    public Bus(String id, boolean electric, int capacidad, double porcentajebateria, String zona, int carburant) {
        super(id, electric, capacidad);
        this.zona = zona;
        this.porcentajebateria = porcentajebateria;
        this.carburant = carburant;
    }

    public void setCarburant(int carburant) {
        this.carburant = carburant;
    }


    public int getCarburant() {
        return carburant;
    }

    public Bus() {
    }


    public double getPorcentajebateria() {
        return porcentajebateria;
    }

    public void setPorcentajebateria(double porcentajebateria) {
        this.porcentajebateria = porcentajebateria;
    }

    @Override
    public void duracionbateria() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(101);
        System.out.println("le queda " + numeroAleatorio + "% de bateria");


    }


    public String getZona() {
        return this.zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }


    @Override
    public void cambiarBateria() {
        System.out.println("cambiando la bateria...");
        this.setPorcentajebateria(100);
        System.out.println("bateria cargada: " + porcentajebateria + "%");

    }


    @Override
    public String toString() {
        return "Bus{" +
                "zona='" + zona + '\'' +
                ", id='" + id + '\'' +

                ", capacidad=" + capacidad +
                ", porcentajebateria=" + porcentajebateria +
                '}';
    }


    @Override
    public void calcularaceleracion() {
        System.out.println("la aceleracion es 200km/h");

    }

    @Override
    public void grethathumberg() {
        System.out.println("esto gasta mucha gasolina espabila y cambia a electrico");

    }


}
