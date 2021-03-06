package components;

public abstract class Component {

    String make;
    String model;

    public Component(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getRadioStation(){
        return this.radio.getStation();
    }
}
