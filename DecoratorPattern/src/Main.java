public class Main {
    public static void main(String[] args) {

        ThickCrustPizza thickCrustPizza = new ThickCrustPizza();

        Corn corn = new Corn(thickCrustPizza);
        corn.addMaterial();

        Mushroom mushroom = new Mushroom(thickCrustPizza);
        mushroom.addMaterial();

        thickCrustPizza.display();
    }
}