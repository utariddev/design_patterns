import java.util.List;

public class Corn extends MaterialDecorator {

    public Pizza pizza;

    public Corn(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    List<String> addMaterial() {
        System.out.println("adding corn");
        pizza.getMaterials().add("corn");
        return pizza.getMaterials();
    }
}
