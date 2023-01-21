public class ArrayItemIterator implements DataIterator {
    int currentIndex = 0;
    private final IteratorItem[] items = new IteratorItem[10];

    @Override
    public void addItem(IteratorItem item) {
        System.out.println("added item to array");
        items[currentIndex++] = item;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < 10;
    }

    @Override
    public IteratorItem getNext() {
        return items[currentIndex++];
    }

    @Override
    public void reset() {
        System.out.println("reset array");
        currentIndex = 0;
    }
}
