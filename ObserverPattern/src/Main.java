public class Main {
    public static void main(String[] args) {
        ConcretePublisher simplePublisher = new ConcretePublisher();

        ConcreteObserver simpleObserverA = new ConcreteObserver(simplePublisher, "observerA");
        simplePublisher.registerObserver(simpleObserverA);

        ConcreteObserver simpleObserverB = new ConcreteObserver(simplePublisher, "observerB");
        simplePublisher.registerObserver(simpleObserverB);

        simplePublisher.setValue(80);
    }
}