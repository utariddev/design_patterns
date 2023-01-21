import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    public String name = "empty pizza";
    private List<String> materials;

    public Pizza() {
        this.materials = new ArrayList<>();
    }

    public void display() {
        System.out.print(name + " with these materials : ");
        for (String material : materials) {
            System.out.print(material + ", ");
        }
    }

    public List<String> getMaterials() {
        return materials;
    }
}
