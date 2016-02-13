
import java.util.ArrayList;

public class YO {

    private ArrayList<MenuItem> menu;
    
    public YO() {
        menu = new ArrayList<MenuItem>();
        MenuItem cheap = new MenuItem("Cheap", 3, "adsasd");
        MenuItem pricy = new MenuItem("Pricy", 5, "asda");
        MenuItem water = new MenuItem("Water", 0, "asd");
        menu.add(cheap);
        menu.add(pricy);
        menu.add(water);
    }

    public Iterator createIterator() {
        return new YOIterator(menu);
    }
}
