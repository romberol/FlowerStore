package flower.store;

import java.util.ArrayList;

public class FLowerStore {
    private ArrayList<FlowerBucket>  buckets;

    FLowerStore(){ 
        this.buckets = new ArrayList<>();
    }

    public void add(FlowerBucket bucket){ 
        this.buckets.add(bucket);
    }

    public ArrayList<FlowerBucket> search(FlowerType flType){ 
        ArrayList<FlowerBucket> foundBuckets = new ArrayList<>();
        for (FlowerBucket flBucket: this.buckets){ 
            for (FlowerPack pack: flBucket.getPacks()){ 
                if (pack.getFlower().getFlowerType() == flType){ 
                    foundBuckets.add(flBucket);
                }
            }
        }
        if (foundBuckets.isEmpty()){ 
            return null;
        }
        return foundBuckets;
    }
}
