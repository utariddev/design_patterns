public class Customer {

    public PizzaFactory factory;

    public Customer(PizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza getPizza(int id) {
        return factory.getPizza(id);
    }
}
