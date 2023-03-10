package herencia1;

public class Cinema {
    protected int id;
    protected String name;
    protected int price;

    public Cinema() {
    }

    public Cinema(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void watchMovie(){
        System.out.println("A new movie is starting...");


    }
    public void openRoom(){
        System.out.println("The room is opened");
    }
    public void closeRoom(){
        System.out.println("The room is cloed");
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cinema" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

