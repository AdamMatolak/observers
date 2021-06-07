package tasrobserver;

public class fbObserver extends Observer{

    public fbObserver(Tasr tasr){
        this.tasr = tasr;
        tasr.attach(this);
    }

    @Override
    public void update() {
        System.out.println("FB: " + tasr.getMessage());

    }
}
