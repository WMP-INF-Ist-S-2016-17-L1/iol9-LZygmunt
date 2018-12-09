abstract class PizzaBuilder {
    protected Pizza pizza;

    public void newPizza() {
        pizza = new Pizza();
    }

    public Pizza getPizza() {
        return pizza;
    }

    public abstract void buildSauce();

    public abstract void buildPizzaDough();

    public abstract void buildIngradients();
}
