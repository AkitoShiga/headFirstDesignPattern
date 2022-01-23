public abstract class Beverage {

    String description = "不明な飲み物";
    String size = "tall";

    public String getDescription() {
        return description;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    public abstract double cost();
}
