package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FlowerStoreTest {
    private static final int ROSE_PRICE = 123;
    private static final int FLOWER_COUNT = 10;
    private FLowerStore flowerShop;

    @BeforeEach
    public void init() {
        flowerShop = new FLowerStore();
    }

    @Test
    public void testSearch() {
        FlowerBucket roseBucket = new FlowerBucket();
        FlowerBucket chamomileBucket = new FlowerBucket();
        Flower rose = new Flower();
        rose.setPrice(ROSE_PRICE);
        rose.setFlowerType(FlowerType.ROSE);
        Flower chamomile = new Flower();
        chamomile.setFlowerType(FlowerType.CHAMOMILE);
        roseBucket.add(new FlowerPack(rose, FLOWER_COUNT));
        chamomileBucket.add(new FlowerPack(chamomile, FLOWER_COUNT));
        flowerShop.add(roseBucket);
        flowerShop.add(chamomileBucket);
        Assertions.assertEquals(FLOWER_COUNT * ROSE_PRICE,
                flowerShop.search(FlowerType.ROSE).get(0).getPrice());
    }
}
