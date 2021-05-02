package GameProject.Entites;

public class Game {
    private int id;
    private String name;
    private double Price;


    public Game(int id, String name, double price) {
        this.id = id;
        this.name = name;
        Price = price;
    }
    public Game(){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
