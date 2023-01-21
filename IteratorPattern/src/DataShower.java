public class DataShower implements Data {

    DataIterator iterator;

    public DataShower(DataIterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public void getItems() {
        while (iterator.hasNext()) {
            System.out.println("iterator item : " + iterator.getNext());
        }
    }

    @Override
    public void createIterator() {
        iterator.addItem(new IteratorItem("item1"));
        iterator.addItem(new IteratorItem("item2"));
        iterator.addItem(new IteratorItem("item3"));
        iterator.addItem(new IteratorItem("item4"));
        iterator.addItem(new IteratorItem("item5"));
        iterator.reset();
    }
}
