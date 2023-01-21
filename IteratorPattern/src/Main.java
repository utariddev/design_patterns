public class Main {
    public static void main(String[] args) {
        DataShower data = new DataShower(new ArrayItemIterator());
        data.createIterator();
        data.getItems();

        DataShower data2 = new DataShower(new ListItemIterator());
        data2.createIterator();
        data2.getItems();
    }
}