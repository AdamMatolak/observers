package tasrobserver;

public class smsObserver extends Observer{

    public smsObserver(Tasr tasr){
        this.tasr = tasr;
        tasr.attach(this);
    }

    @Override
    public void update() {

    }
}
