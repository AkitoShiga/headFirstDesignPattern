public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        if (item.equals("チーズ")) {
            return new NYStyleCheesePizza();
        }
        /*
        else if(item.equals("野菜")) {
            return new NYStyleVeggiPizza();
        }else if(item.equals("クラム")) {
            return new NYStyleClamPizza();
        }else if(item.equals("ペパロニ")) {
            return new NYStylePepperoniPizza();
        }
        */
        else return null;
    }
}
