package components.radio;

import components.Component;

public class Radio extends Component {

    String station;

    public Radio(String make, String model, String station) {
        super(make, model);
        this.station = station;
    }

    public String getStation() {
        return station;
    }
}
