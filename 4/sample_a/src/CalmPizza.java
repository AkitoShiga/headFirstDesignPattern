public class CalmPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CalmPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    void prepare() {
        System.out.printlin(name + "γδΈε¦η");
        dough  = ingredientFactory.createDough();
        sauce  = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        calm   = ingredientFactory.createCalm();
    }
}
