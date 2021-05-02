package GameProject.Entites;

public class Campaign {
    private int id;
    private String name;
    private double percent;
    private double discount;

    public Campaign(int id, String name, double percent, double discount) {
        this.id = id;
        this.name = name;
        this.percent = percent;
        this.discount = discount;
    }

    public Campaign(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
