public class Main {
    public static void main(String[] args) {

        DishWasher dishWasher = new DishWasher();
        test(dishWasher);

        CleaningMachine washingMachine = new WashingMachine();
        test(washingMachine);
    }

    public static void test(CleaningMachine cleaningMachine) {
        cleaningMachine.openDoor();
        cleaningMachine.closeDoor();
        cleaningMachine.work();
    }
}