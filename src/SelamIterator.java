


public class SelamIterator implements Iterator {

    private MenuItem[] items;

    private int pos;

    public SelamIterator(MenuItem[] i) {
        items = i;
        pos = 0;
    }
    public Object next() {
        return items[pos++];
    }

    public boolean hasNext() {
        if (pos == items.length) {
            return false;
        }
        else {
            return true;
        }
    }
}
