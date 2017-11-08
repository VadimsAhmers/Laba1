abstract class Containers extends Item {

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

    protected void addItem(Item item) throws ItemStoreException, ItemAlreadyAddedException{

        if (this.attributes.contains("isAdded")) throw new ItemStoreException();
        if (item.attributes.contains("isAdded")) throw new ItemAlreadyAddedException();

        this.fullWeight +=item.fullWeight;
        item.attributes.add("isAdded");

    }
    protected void pullOutAttributes(Item pulledOutItem){
        this.fullWeight -= pulledOutItem.itemWeight;
        pulledOutItem.attributes.remove("isAdded");
    }

    abstract Item pullOut();
}
