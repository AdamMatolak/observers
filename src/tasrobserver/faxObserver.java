package tasrobserver;

public class faxObserver extends Observer{

    public faxObserver(Tasr tasr){
        this.tasr=tasr;
        tasr.attach(this);
    }

    @Override
    public void update() {

    }
}
