public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    void prepare() {
        System.out.printlin(name + "γδΈε¦η");
        dough  = ingredientFactory.createDough();
        sauce  = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
