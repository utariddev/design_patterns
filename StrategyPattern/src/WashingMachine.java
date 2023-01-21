public class WashingMachine extends CleaningMachine {

    public WashingMachine() {
        cleanStrategy = new CleanClothes();
    }

    @Override
    void openDoor() {
        System.out.println("washing machine opens the door");
    }

    @Override
    void closeDoor() {
        System.out.println("washing machine closes the door");
    }
}
