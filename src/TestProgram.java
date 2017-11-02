import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class TestProgram {

    static Item a = new Item("brick1", 2, "flat"),
                b = new Item("brick2", 2, "flat"),
                c = new Item("brick3", 2, "flat");
    static Bag d = new Bag("bag1", 5, 0.1);
    static Box e = new Box("box1", 10, 0.5);


    @Test
    public void testItemObjectsCreation(){

        assertNotNull(a);
        assertNotNull(b);
        assertNotNull(c);
        assertNotNull(d);
        assertNotNull(e);
    }

    @Test
    public void testAddItem(){
        d.addItem(a);
        d.addItem(b);
        e.addItem(c);

        assertEquals(4.1, d.fullWeight, 0);
        //assertEquals(2.5, e.getItemsWeight(),  0);

        e.addItem(d);
        assertEquals(6.6, e.fullWeight, 0);

    }

    protected void emptyAllContainers(){
        if (a.attributes.contains("isAdded")) a.attributes.remove("isAdded");
        if (b.attributes.contains("isAdded")) b.attributes.remove("isAdded");
        if (c.attributes.contains("isAdded")) c.attributes.remove("isAdded");
        if (d.attributes.contains("isAdded")) d.attributes.remove("isAdded");

        d.content = new HashSet<>();

        //System.out.println(a.toString());

    }

    @Test(expected = Containers.ItemStoreException.class)
    public void testItemStoreExceptionThrowingWhenItemIsAdded(){

        emptyAllContainers();
        d.addItem(a);
        //d.addItem(a);
    }



    /*@Test(expected = Containers.ItemStoreException.class)
    public void testItemStoreExceptionThrowingWhenMaxWeightIsExceeded(){
        a.attributes.remove("isAdded");
        b.attributes.remove("isAdded");
        c.attributes.remove("isAdded");
        d.attributes.remove("isAdded");
        d.addItem(a);
        d.addItem(b);
        e.addItem(c);
        e.addItem(d);
    }*/

}
