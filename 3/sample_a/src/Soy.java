public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + "、豆乳";
    }

    public double cost() {
        double cost ;
        if(beverage.getSize() == "tall") {
            cost = .10;
        } else if(beverage.getSize() == "grande") {
            cost = .15;
        } else {
            cost = .20;
        }
        return cost + beverage.cost();
    }
}
