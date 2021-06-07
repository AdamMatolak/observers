package tasrobserver;

import java.util.List;

public class Tasr {
    private List<Observer> list;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        notifyAllObservers();
    }

    private void notifyAllObservers(){

    }
    public void attach(Observer observer){

    }
}
