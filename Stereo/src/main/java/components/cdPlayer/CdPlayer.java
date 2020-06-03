package components.cdPlayer;

import components.Component;

public class CdPlayer extends Component {

    int numberOfCds;

    public CdPlayer(String make, String model, int numberOfCds) {
        super(make, model);
        this.numberOfCds = numberOfCds;
    }

    public int getNumberOfCds() {
        return numberOfCds;
    }
}
