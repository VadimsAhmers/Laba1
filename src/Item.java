import java.util.HashSet;

 class Item {

    protected String name;
    protected double itemWeight;
    protected double fullWeight;
    protected HashSet<String> attributes;

    protected String getName() {
        return name;
    }
    protected double getWeight() {
        return itemWeight;
    }

    protected HashSet<String> getAttributes() {
        return attributes;
    }

    @Override
    public String toString(){

        String info = "Class: " + this.getClass() + ";" + "Name: " + this.name + " "; //+ ";" + "Weight: " + this.weight + ";"

        for (String s:this.attributes) info +=" " + s;
        return info;
    }

    protected void getInfo(){
        System.out.println(this.toString());

    }

    protected Item(String name, double itemWeight, String attribute)    {

        this.name = name;
        this.itemWeight = itemWeight;
        this.fullWeight = itemWeight;
        attributes = new HashSet<>();

        attributes.add(attribute);
    }

    protected Item(String name, double itemWeight){

        this.name = name;
        this.itemWeight = itemWeight;
        this.fullWeight = itemWeight;
        attributes = new HashSet<>();
    }

    protected Item(String name) {
        this.name = name;
        attributes = new HashSet<>();
    }
}
