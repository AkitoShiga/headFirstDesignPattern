public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = 
            new NYPizzaIngredientFactory();

        if (item.equals("チーズ")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("ニューヨークスタイルチーズピザ");
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
