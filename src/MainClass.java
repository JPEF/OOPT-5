public class MainClass {

    public static void main(String[] args) {
        Selam selam = new Selam();
        YO yo = new YO();
        print(selam.createIterator());
        print(yo.createIterator());
    }
    
    public static void print(Iterator it) {
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}
