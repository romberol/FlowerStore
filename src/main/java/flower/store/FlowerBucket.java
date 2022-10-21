package flower.store;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
public class FlowerBucket {
    @Getter
    double price = 0;
    @Getter
    private ArrayList<FlowerPack> packs;

    FlowerBucket(){
        this.packs = new ArrayList<>();
    }
    public void add(FlowerPack pack){
        this.price += pack.getPrice();
        this.packs.add(pack);
    }
}
