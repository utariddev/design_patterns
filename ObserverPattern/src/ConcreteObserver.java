public class ConcreteObserver implements Observer {
    private int value;
    private final String observerName;
//    private Publisher simplePublisher;

    public ConcreteObserver(Publisher simplePublisher, String observerName) {
//        this.simplePublisher = simplePublisher;
        this.observerName = observerName;
//        simplePublisher.registerObserver(this);
    }

    public void update(int value) {
        this.value = value;
        display();
    }

    public void display() {
        System.out.println("observerName : " + observerName + " - value : " + value);
    }
}
