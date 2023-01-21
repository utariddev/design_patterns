import java.util.List;

public class Mushroom extends MaterialDecorator {
    public Pizza pizza;

    public Mushroom(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    List<String> addMaterial() {
        System.out.println("adding mushroom");

        pizza.getMaterials().add("mushroom");
        return pizza.getMaterials();
    }
}
