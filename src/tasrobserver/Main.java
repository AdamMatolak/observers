package tasrobserver;

public class Main {
    public static void main(String[] args) {
        var tasr = new Tasr();

        new faxObserver(tasr);
        new fbObserver(tasr);
        new mailObserver(tasr);

        tasr.setMessage("New message!");
    }
}
