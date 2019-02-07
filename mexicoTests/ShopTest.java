package epam.mexicoTests;

import epam.mexico.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ShopTest {
    List<Flower> flower = new ArrayList<>();
    List<Palm> palm = new ArrayList<>();
    List<Pot> pot = new ArrayList<>();
    List<Posy> posy = new ArrayList<>();
    private float wrapper;
    @Before

    public void setUp(){
        flower.add(new Tulip("Tulip", Color.RED, Localization.FOREIGN, Growing.GARDEN, 22, 30));
        flower.add(new Kaktus("Kaktus", Color.GREEN, Localization.LOCAL, Growing.POT, 50, 350));

        palm.add(new Palm(1,"Palm", Color.GREEN, Localization.LOCAL, Growing.GARDEN, 120, 3000));

        pot.add(new Pot(1, Size.S, Color.GREEN));

        posy.add(new Posy(43, "For You", 100));
        wrapper = 30;


    }
    @Test
    public void testBuyPot(){
        Shop shop = new Shop();
        assertEquals(20,shop.buyPot(),0.1);
    }

    @Test
    public void testDiscount() {
        Shop shop = new Shop();
        float n=500f;
        assertEquals(400f,shop.discount(n),0.1);

    }


}