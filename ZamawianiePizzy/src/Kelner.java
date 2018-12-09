public class Kelner {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public void orderPizza(){
        pizzaBuilder.newPizza();
        pizzaBuilder.buildIngradients();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildPizzaDough();
    }
}
