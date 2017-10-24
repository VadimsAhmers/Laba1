import java.util.HashSet;

class Bag extends Containers{

    private double maxWeight = 0;
    private double itemsWeight = 0;


    protected Bag(String Name, double maxWeight, double Weight) {
        this.name = Name;
        this.maxWeight = maxWeight;
        this.Weight = Weight;

        contains = new HashSet<Item>();
    }

       protected void add(Item item)  {

            if (( itemsWeight + item.Weight )< maxWeight ){
                contains.add(item);
            }
            else throw new ItemStoreException();



        }


}
