public class Triathlete extends Athlete implements IRun, ISwim{

    public void run(int distance){
        this.distanceTravelled += distance;
    }

    public void swim(int distance){
        this.distanceTravelled += distance;
    }

    public void cycle(int distance){
        distanceTravelled += distance;
    }

}
