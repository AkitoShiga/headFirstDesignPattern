public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough(){
        return new ThinCrustDough();
    };
    public Sauce createSauce(){
        return new MarianaraSauce();
    };
    public Cheese createCheese(){
        return new ReggianoCheese();
    };
    public Veggies[] createVeggies(){
        Veggies veggies[] = {
            new Garilc()
            ,new Onion()
            ,new Mushruum()
            ,new RedPepper()
        }
        return veggies;
    };
    public Pepperoni createPepperoni(){
        return new SlicedPepperoni();
    };
    public Clams createClams (){
        return new FreshClams();
    };
}
