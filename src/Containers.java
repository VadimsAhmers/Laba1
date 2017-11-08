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

    abstract protected void addItem(Item item) throws ItemStoreException, ItemAlreadyAddedException;

    abstract protected Item pullOut();
}
