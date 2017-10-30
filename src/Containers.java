//import java.util.HashSet;
import java.util.Collection;
import java.util.Iterator;

abstract class Containers extends Item {


    Collection<Item> contains;

    protected Containers(String name, double weight) {
        super(name, weight);
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
        Iterator<Item> iterator = contains.iterator();

        Item pulledOutItem = null;

        if (iterator.hasNext()) {
            pulledOutItem = iterator.next();
            iterator.remove();
        }

        return pulledOutItem;

    }

    protected Collection<Item> getItemsList(){
        return contains;
    }

    class ItemStoreException extends RuntimeException{

    }


}
