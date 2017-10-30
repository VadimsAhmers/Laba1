import java.util.HashSet;

 class Item {

    protected String name;
    protected double weight;
    protected HashSet<String> attributes;

    protected String getName() {
        return name;
    }

    protected double getWeight() {
        return weight;
    }

    protected HashSet<String> getAttributes() {
        return attributes;
    }

    @Override
    public String toString(){
        return "Class: " + this.getClass() + ";" + "Name: " + this.name; //+ ";" + "Weight: " + this.weight + ";"

    }

    protected void getInfo(){
        this.toString();

    }

    protected Item(String name, double weight, String attribute)    {

        this.name = name;
        this.weight = weight;
        attributes = new HashSet<>();

        attributes.add(attribute);
    }

    protected Item(String name, double weight){

        this.name = name;
        this.weight = weight;
        attributes = new HashSet<>();
    }

    protected Item(String name) {
        this.name = name;
        attributes = new HashSet<>();
    }





}
