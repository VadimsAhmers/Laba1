public class Program {

    public static void main(String[] args) {

        Item a = new Item("brick1", 2, "flat");
        Item b = new Item("brick2", 2, "flat");
        Item c = new Item("brick3", 2, "flat");

        Bag d = new Bag("bag1", 5, 0.1);
        Box e = new Box("box1", 10, 0.5);

        try {
            d.addItem(a);
            d.addItem(b);
        }catch (ItemStoreException ise){
            System.out.println("Не лезет больше");
        }catch (ItemAlreadyAddedException iaae){
            System.out.println("Предмет уже где-то лежит");
        }

    }
}
