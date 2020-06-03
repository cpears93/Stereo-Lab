public class Printer extends IConnect {

    public String print(String data){
        return "printing: " + data;
    }

    @Override
    public String connect(String data){
        return "connecting to " + data + " network";
    }
}