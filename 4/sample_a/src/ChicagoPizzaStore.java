public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        if (item.equals("チーズ")) {
            return new ChicagoStyleCheesePizza();
        }
        /*
        else if(item.equals("野菜")) {
            return new ChicagoStyleVeggiPizza();
        }else if(item.equals("クラム")) {
            return new ChicagoStyleClamPizza();
        }else if(item.equals("ペパロニ")) {
            return new ChicagoStylePepperoniPizza();
        }
        */
        else return null;
    }
}
