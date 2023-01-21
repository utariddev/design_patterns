public class PizzaFactory {
    public Pizza getPizza(int id) {

        switch (id) {
            case 0:
                return new CheesePizza();
            case 1:
                return new PepperoniPizza();
            case 2:
                return new VeggiePizza();
            default:
                return null;
        }

    }
}
