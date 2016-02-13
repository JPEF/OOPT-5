public class MenuItem {

    private String name;

    private int price;

    private String description;

    public MenuItem(String n, int p, String d) {
        name = n;
        price = p;
        description = d;
    }
    
    public String toString() {
        return (name + " costs " + price + "€. " + description);
    }
}
