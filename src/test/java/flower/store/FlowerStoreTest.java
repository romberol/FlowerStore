package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FlowerStoreTest {
    private FLowerStore flowerShop;

    @BeforeEach
    public void init() {
        flowerShop = new FLowerStore();
    }

    @Test
    public void testSearch(){
        FlowerBucket roseBucket = new FlowerBucket();
        FlowerBucket chamomileBucket = new FlowerBucket();
        Flower rose = new Flower();
        rose.setPrice(123);
        rose.setFlowerType(FlowerType.ROSE);
        Flower chamomile = new Flower();
        chamomile.setFlowerType(FlowerType.CHAMOMILE);
        roseBucket.add(new FlowerPack(rose, 10));
        chamomileBucket.add(new FlowerPack(chamomile, 5));
        flowerShop.add(roseBucket);
        flowerShop.add(chamomileBucket);
        Assertions.assertEquals(10 * 123, flowerShop.search(FlowerType.ROSE).get(0).getPrice());
    }
}
