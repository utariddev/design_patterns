public interface Publisher {
    public void registerObserver(Observer o);

    public void unregisterObserver(Observer o);

    public void notifyObservers(int value);
}
