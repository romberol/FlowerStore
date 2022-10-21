package flower.store;

import java.util.ArrayList;

public class FLowerStore {
    ArrayList<FlowerBucket> buckets;

    FLowerStore(){
        this.buckets = new ArrayList<>();
    }

    public void add(FlowerBucket bucket){
        this.buckets.add(bucket);
    }

    public FlowerBucket search(FlowerType fl_type){
        for (FlowerBucket fl_bucket: this.buckets){
            for (FlowerPack pack: fl_bucket.getPacks()){
                if (pack.getFlower().getFlowerType() == fl_type){
                    return fl_bucket;
                }
            }
        }
        return null;
    }
}
