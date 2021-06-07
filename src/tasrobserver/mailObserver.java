package tasrobserver;

public class mailObserver extends Observer{

    public mailObserver(Tasr tasr){
        this.tasr = tasr;
        tasr.attach(this);
    }

    @Override
    public void update() {

    }
}
