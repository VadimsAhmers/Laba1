import java.util.HashSet;

 class Item {

    protected String name;
    protected double weight;
    protected HashSet<String> attributes;

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public HashSet<String> getAttributes() {
        return attributes;
    }

    protected Item(String name, double weight, String attribute)    {

        this.name = name;
        this.weight = weight;
        attributes.add(attribute);
    }

    protected Item(String name, double weight){

        this.name = name;
        this.weight = weight;
    }

    protected Item(String name) {
        this.name = name;
    }





}
