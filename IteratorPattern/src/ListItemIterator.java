import java.util.ArrayList;
import java.util.List;

public class ListItemIterator implements DataIterator {
    int currentIndex = 0;
    private final List<IteratorItem> items = new ArrayList<>();

    @Override
    public void addItem(IteratorItem item) {
        System.out.println("added item to list");
        items.add(item);
    }

    @Override
    public boolean hasNext() {
        return currentIndex < items.size();
    }

    @Override
    public IteratorItem getNext() {
        return items.get(currentIndex++);
    }

    @Override
    public void reset() {
        System.out.println("reset list");
        currentIndex = 0;
    }
}
