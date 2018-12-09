public class Main {
    public static void main(String[] args) {
        Kelner kelner = new Kelner();
        PizzaBuilder pizzaBuilder = new PizzaPepperoni();

        System.out.println("\nPizza Pepperoni");
        kelner.setPizzaBuilder(pizzaBuilder);
        kelner.orderPizza();
        Pizza pizzaPepperoni = kelner.getPizza();
        System.out.println(pizzaPepperoni.toString());
    }
}
