import java.util.HashSet;

class Bag extends Containers{

    private double maxWeight = 0;
    private double itemsWeight = 0;



    protected Bag(String name, double maxWeight, double weight) {

        super(name, weight);
        this.maxWeight = maxWeight;

        contains = new HashSet<Item>();
    }

    @Override
    public String toString(){

        String resultInfo= super.toString();
        resultInfo+="Attributes: ";

        for (String s:attributes)   resultInfo+=s;

        return resultInfo;

    }

       protected void addItem(Item item)  {

            if (( itemsWeight + item.weight )< maxWeight ){
                contains.add(item);
                itemsWeight+=item.weight;
            }
            else throw new ItemStoreException();

        }




}
