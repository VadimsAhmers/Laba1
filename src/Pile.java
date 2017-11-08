import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Pile extends Containers{

    private int maxItemsQuantity = 0;
    protected int itemsQuantity = 0;
    protected Deque<Item> content;

    @Override
    protected void addItem(Item item) throws ItemStoreException, ItemAlreadyAddedException{

        if (((itemsQuantity<maxItemsQuantity)&&(item.attributes.contains("flat")))) {

             super.addItem(item);

             content.add(item);
             itemsQuantity++;
        }
        else throw new ItemStoreException();


    }

    protected Item pullOut(){

        Item pulledOutItem = content.pollLast();

        if (!(pulledOutItem==null)){

            pullOutAttributes(pulledOutItem);
        }

        return pulledOutItem;

    }

    @Override
    public String toString(){
        String resultInfo = super.toString();

        return resultInfo;

    }


    protected Pile(String name, int maxItemsQuantity){
        super(name);
        this.content = new ArrayDeque<Item>();
        this.maxItemsQuantity = maxItemsQuantity;

    }

    
}
