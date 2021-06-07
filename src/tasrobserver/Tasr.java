package tasrobserver;

import java.util.ArrayList;
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
        for (Observer o : list){
            o.update();
        }
    }
    public void attach(Observer observer){

        if (observer==null) {
            return;
        }
        if (list==null){
            list = new ArrayList<>();
        }
        list.add(observer);
    }
}
