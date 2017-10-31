import java.util.ArrayDeque;

public class Pile extends Containers{

    private int maxItemsQuantity = 0;
    private int itemsQuantity = 0;


    protected void addItem(Item item){

        if (((itemsQuantity<maxItemsQuantity)&&(item.attributes.contains("flat")))&&(!item.attributes.contains("isAdded"))) {
             content.add(item);
             itemsQuantity++;
             item.attributes.add("isAdded");
        }
        else throw new ItemStoreException();

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
