public abstract class CleaningMachine {

    CleanStrategy cleanStrategy;

    public void setCleanStrategy(CleanStrategy cs) {
        cleanStrategy = cs;
    }

    abstract void openDoor();

    abstract void closeDoor();

    void work() {
        cleanStrategy.clean();
    }
}
