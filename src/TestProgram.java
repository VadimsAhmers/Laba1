import org.junit.Test;

import static org.junit.Assert.*;

public class TestProgram {

    @Test
    public void testItemObjectsCreation(){

        Item a = new Item("brick1", 2, "flat");
        Item b = new Item("brick2", 2, "flat");
        Item c = new Item("brick3", 2, "flat");

        Bag d = new Bag("bag1", 5, 0.1);
        Box e = new Box("box1", 10, 0.5);

        assertNotNull(a);
        assertNotNull(b);
        assertNotNull(c);
        assertNotNull(d);
        assertNotNull(e);

        d.addItem(a);
        d.addItem(b);

        e.addItem(c);

        assertEquals(4.1, d.getItemsWeight(), 0);
       //assertEquals(2.5, e.getItemsWeight(),  0);

        e.addItem(d);
        assertEquals(6.5, e.getItemsWeight(), 0);


    }


}
