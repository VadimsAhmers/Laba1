import java.util.HashSet;

 class Item {

    protected String name;
    protected Double weight;
    protected HashSet<String> attributes;

    public String getName() {
        return name;
    }

    public Double getWeight() {
        return weight;
    }

    public HashSet<String> getAttributes() {
        return attributes;
    }

    protected Item(String itemName, double Weight, String attribute)    {

        this.name = itemName;
        this.weight = weight;
        attributes.add(attribute);

    }
    // хуй знает зачем он нужен блять, но компиоятор ругается на его недоступность
    protected Item(){

    }





}
