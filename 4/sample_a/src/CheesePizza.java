public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    void prepare() {
        System.out.printlin(name + "を下処理");
        dough  = ingredientFactory.createDough();
        sauce  = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
