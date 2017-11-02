//import java.util.HashSet;
import java.util.Collection;
import java.util.Iterator;

abstract class Containers extends Item {


    Collection<Item> content;

    protected Containers(String name, double itemWeight) {
        super(name, itemWeight);
    }

    protected Containers(String name){

        super(name);
    }

    @Override
    public String toString(){
        return super.toString();
    }

    abstract protected void addItem(Item item) throws ItemStoreException;

    protected Item pullOut(){
        Iterator<Item> iterator = content.iterator();

        Item pulledOutItem = null;

        if (iterator.hasNext()) {
            pulledOutItem = iterator.next();
            iterator.remove();
            this.fullWeight -= pulledOutItem.itemWeight;
        }

        return pulledOutItem;

    }

    protected Collection<Item> getItemsList(){
        return content;
    }

    class ItemStoreException extends RuntimeException{

    }


}
