
public interface PizzaIngredientFactory {
    public Dough createDough(){
        return new ThickCrustDough();
    };
    public Sauce createSauce (){
        return new PlamTomatoSauce();
    };
    public Chees createCheese(){
        return new MozzarellaCheese();
    };
    public Veggies[] createVeggies(){
        return new BlackOlives();
    };
    public Pepperoni createPepperoni(){
        return new SlicedPepperoni();
    };
    public Clams createClams (){
        return FrozenClams;
    };
}
