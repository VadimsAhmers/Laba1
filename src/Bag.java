import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Bag extends Containers{

    private double maxWeight = 0;
    protected Set<Item> content = new HashSet<>();

    protected Bag(String name, double maxWeight, double weight) {

        super(name, weight);
        this.maxWeight = maxWeight;
        content = new HashSet<Item>();
    }

    @Override
    public String toString(){

        String resultInfo = super.toString();
        resultInfo+=" Attributes: ";

        for (String s:attributes)   resultInfo+=s;

        return resultInfo;

    }
    @Override
    protected void addItem(Item item) throws ItemStoreException, ItemAlreadyAddedException  {

        if ((( this.fullWeight + item.itemWeight -this.itemWeight )<= maxWeight )){
                super.addItem(item);
                content.add(item);
            }
            else throw new ItemStoreException();

        }

    protected Item pullOut(){
        Iterator<Item> iterator = content.iterator();
        Item pulledOutItem = null;

        if (iterator.hasNext()) {
            pulledOutItem = iterator.next();
            iterator.remove();
            pullOutAttributes(pulledOutItem);
        }
        return pulledOutItem;

    }




}
