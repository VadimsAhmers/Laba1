import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Pile extends Containers{

    private int maxItemsQuantity = 0;
    protected int itemsQuantity = 0;
    protected Deque<Item> content;


    protected void addItem(Item item) throws ItemStoreException, ItemAlreadyAddedException{

        if (item.attributes.contains("isAdded")) throw new ItemAlreadyAddedException();

        if (((itemsQuantity<maxItemsQuantity)&&(item.attributes.contains("flat")))) {

             content.add(item);
             itemsQuantity++;
             item.attributes.add("isAdded");
        }
        else throw new ItemStoreException();

    }

    protected Item pullOut(){

        Item pulledOutItem = content.pollLast();

        if (!pulledOutItem.equals(null)){
            this.fullWeight -= pulledOutItem.itemWeight;
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
