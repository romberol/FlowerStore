package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FlowerStoreTest {
    private FLowerStore flowerShop;
    private static final int rosePrice = 123;
    private static final int flowersCount = 10;

    @BeforeEach
    public void init() {
        flowerShop = new FLowerStore();
    }

    @Test
    public void testSearch(){ 
        FlowerBucket roseBucket = new FlowerBucket();
        FlowerBucket chamomileBucket = new FlowerBucket();
        Flower rose = new Flower();
        rose.setPrice(rosePrice);
        rose.setFlowerType(FlowerType.ROSE);
        Flower chamomile = new Flower();
        chamomile.setFlowerType(FlowerType.CHAMOMILE);
        roseBucket.add(new FlowerPack(rose, flowersCount));
        chamomileBucket.add(new FlowerPack(chamomile, flowersCount/5));
        flowerShop.add(roseBucket);
        flowerShop.add(chamomileBucket);
        Assertions.assertEquals(flowersCount * rosePrice, 
                flowerShop.search(FlowerType.ROSE).get(0).getPrice());
    }
}
