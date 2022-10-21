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
        for (FlowerBucket fl_bucket: this.buckets){
            for (FlowerPack pack: fl_bucket.getPacks()){
                if (pack.getFlower().getFlowerType() == flType){
                    foundBuckets.add(fl_bucket);
                }
            }
        }
        if(foundBuckets.isEmpty()){
            return null;
        }
        return foundBuckets;
    }
}
