package attractions;

import behaviours.ISecurity;

public class RollerCoaster  extends Attraction implements ISecurity {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo() {
        return false;
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
