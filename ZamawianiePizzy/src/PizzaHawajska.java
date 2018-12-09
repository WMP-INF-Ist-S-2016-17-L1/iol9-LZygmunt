public class PizzaHawajska extends PizzaBuilder {
    @Override
    public void buildSauce() {
        pizza.setSauce("łagodny");
    }
    @Override
    public void buildPizzaDough() {
        pizza.setPizzaDough("cienkie");
    }
    @Override
    public void buildIngradients() {
        pizza.setIngredients("annanas + szynka");
    }
}
