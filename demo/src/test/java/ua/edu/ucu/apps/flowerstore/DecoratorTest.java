package ua.edu.ucu.apps.flowerstore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.flowerstore.store.BasketDecorator;
import ua.edu.ucu.apps.flowerstore.store.Item;
import ua.edu.ucu.apps.flowerstore.store.PaperDecorator;
import ua.edu.ucu.apps.flowerstore.store.RibbonDecorator;

import java.util.Random;

public class DecoratorTest {
    private Item item;
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private static final int PRICE = RANDOM_GENERATOR.nextInt(MAX_PRICE);
    @BeforeEach
    public void init(){
        item = new Item() {
            @Override
            public double getPrice() {
                return PRICE;
            }

            @Override
            public String getDescription() {
                return "Random Item";
            }
        };
    }
    @Test
    public void testPaper(){
        PaperDecorator paperDecorator = new PaperDecorator(item);
        Assertions.assertEquals(paperDecorator.getDescription(),item.getDescription());
        Assertions.assertEquals(paperDecorator.getPrice(),13 + item.getPrice());
    }
    @Test
    public void testRibbon(){
        RibbonDecorator ribbonDecorator = new RibbonDecorator(item);
        Assertions.assertEquals(ribbonDecorator.getDescription(),item.getDescription());
        Assertions.assertEquals(ribbonDecorator.getPrice(),40 + item.getPrice());
    }@Test
    public void testBasket(){
        BasketDecorator basketDecorator = new BasketDecorator(item);
        Assertions.assertEquals(basketDecorator.getDescription(),item.getDescription());
        Assertions.assertEquals(basketDecorator.getPrice(),4 + item.getPrice());
    }
}
