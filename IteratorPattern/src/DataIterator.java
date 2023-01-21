public interface DataIterator {

    public void addItem(IteratorItem item);

    boolean hasNext();

    IteratorItem getNext();

    void reset();
}
