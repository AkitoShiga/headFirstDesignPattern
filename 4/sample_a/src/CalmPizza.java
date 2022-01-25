public class CalmPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CalmPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    void prepare() {
        System.out.printlin(name + "を下処理");
        dough  = ingredientFactory.createDough();
        sauce  = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        calm   = ingredientFactory.createCalm();
    }
}
