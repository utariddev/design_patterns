public class Main {
    public static void main(String[] args) {

        DishWasher dishWasher = new DishWasher();
        test(dishWasher);

        CleaningMachine washingMachine = new WashingCleaningMachine();
        test(washingMachine);

        Television television = new Television();
        CleaningMachine televisionAdapter = new TelevisionAdapter(television);
        test(televisionAdapter);
    }

    public static void test(CleaningMachine cleaningMachine)
    {
        cleaningMachine.openDoor();
        cleaningMachine.closeDoor();
        cleaningMachine.work();
    }
}