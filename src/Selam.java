public class Selam {

    private MenuItem[] menu;
    
    public Selam() {
        menu = new MenuItem[3];
        MenuItem kebab = new MenuItem("Kebab", 8, "adsasd");
        MenuItem pizza = new MenuItem("Pizza", 10, "asda");
        MenuItem coke = new MenuItem("Coca Cola", 3, "asd");
        menu[0] = kebab;
        menu[1] = pizza;
        menu[2] = coke;
    }

    public Iterator createIterator() {
        return new SelamIterator(menu);
    }
}
