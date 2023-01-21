public class Main {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        Customer customer = new Customer(factory);
        Pizza pizza = customer.getPizza(10);
        System.out.println(pizza);
    }
}