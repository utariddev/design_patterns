import java.util.ArrayList;

public class ConcretePublisher implements Publisher {
    private final ArrayList<Observer> observers;

    public ConcretePublisher() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers(int value) {
        for (Observer observer : observers) {
            observer.update(value);
        }
    }

    public void setValue(int value) {
        System.out.println("publish new value : " + value);
        notifyObservers(value);
    }
}