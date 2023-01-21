public class DishWasher extends CleaningMachine {

    public DishWasher() {
        cleanStrategy = new CleanDishes();
    }

    @Override
    void openDoor() {
        System.out.println("dish washer opens the door");
    }

    @Override
    void closeDoor() {
        System.out.println("dish washer closes the door");
    }
}
