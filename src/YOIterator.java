
import java.util.ArrayList;

public class YOIterator implements Iterator {

    private ArrayList<MenuItem> items;

    private int pos;

    public YOIterator(ArrayList<MenuItem> i) {
        items = i;
        pos = 0;
    }
    public Object next() {
        return items.get(pos++);
    }

    public boolean hasNext() {
        if (items.size() == pos) {
            return false;
        }
        else {
            return true;
        }
    }
}
