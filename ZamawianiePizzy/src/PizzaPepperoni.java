public class PizzaPepperoni extends PizzaBuilder {

    @Override
    public void buildSauce() {
        pizza.setSauce("ostry");
    }

    @Override
    public void buildPizzaDough() {
        pizza.setPizzaDough("średnie");
    }

    @Override
    public void buildIngradients() {
        pizza.setIngredients("peperoni + salami");
    }
}
