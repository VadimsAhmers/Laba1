import org.junit.Test;

import java.util.ArrayDeque;
import java.util.HashSet;

import static org.junit.Assert.*;

public class TestProgram {

    private static Item a = new Item("brick1", 2, "flat"),
                b = new Item("brick2", 2, "flat"),
                c = new Item("brick3", 2, "flat");
    private static Bag d = new Bag("bag1", 5, 0.1);
    private static Box e = new Box("box1", 10, 0.5);
    private static Pile f = new Pile("pile1", 3);


    @Test
    public void testItemObjectsCreation(){

        assertNotNull(a);
        assertNotNull(b);
        assertNotNull(c);
        assertNotNull(d);
        assertNotNull(e);
        assertNotNull(f);

    }

    @Test
    public void testAddItem() throws ItemStoreException, ItemAlreadyAddedException{
        emptyAllContainers();

        d.addItem(a);
        d.addItem(b);
        e.addItem(c);

        assertEquals(4.1, d.fullWeight, 0);
        //assertEquals(2.5, e.getItemsWeight(),  0);

        e.addItem(d);
        assertEquals(6.6, e.fullWeight, 0);

    }

    private void emptyAllContainers(){
        if (a.attributes.contains("isAdded")) a.attributes.remove("isAdded");
        if (b.attributes.contains("isAdded")) b.attributes.remove("isAdded");
        if (c.attributes.contains("isAdded")) c.attributes.remove("isAdded");
        if (d.attributes.contains("isAdded")) d.attributes.remove("isAdded");

        d.content = new HashSet<>();
        e.content = new HashSet<>();
        f.content = new ArrayDeque<>();
        d.fullWeight = d.itemWeight;
        e.fullWeight = e.itemWeight;
        f.itemsQuantity = 0;

    }

    @Test(expected = ItemAlreadyAddedException.class)
    public void testItemAlreadyAddedExceptionThrowing() throws ItemStoreException, ItemAlreadyAddedException{

        emptyAllContainers();


            d.addItem(a);
            d.addItem(a);

    }

    @Test(expected = ItemStoreException.class)
    public void testItemStoreExceptionThrowingWhenMaxWeightIsExceeded() throws ItemStoreException, ItemAlreadyAddedException{

        emptyAllContainers();

        d.addItem(a);
        d.addItem(b);
        e.addItem(c);
        e.addItem(d); // Вес = 6.6 кг, не хватает до максимального

        Item heavyWeight = new Item("brick4", 4);
        e.addItem(heavyWeight);
    }

    @Test
    public void testAddItemsToPile() throws ItemStoreException, ItemAlreadyAddedException{

        emptyAllContainers();

        f.addItem(a);
        f.addItem(b);
        f.addItem(e);
        assertTrue(f.pullOut()==e);
    }

    @Test(expected = ItemStoreException.class)
    public void testItemStoreExceptionThrowingWhenItemIsNotFlat() throws ItemStoreException, ItemAlreadyAddedException{
        emptyAllContainers();
        f.addItem(a);
        f.addItem(d);
    }



}
