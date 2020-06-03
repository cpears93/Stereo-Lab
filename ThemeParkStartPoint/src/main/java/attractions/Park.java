package attractions;

import behaviours.IReviewed;

public class Park extends Attraction implements IReviewed {

    public Park(String name, int rating) {
        super(name, rating);
    }

    @Override
    public int rating() {
        return 0;
    }

    @Override
    public String name() {
        return null;
    }
}
