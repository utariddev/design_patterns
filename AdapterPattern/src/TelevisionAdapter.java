public class TelevisionAdapter extends CleaningMachine {

    Television television;

    public TelevisionAdapter(Television tv) {
        television = tv;
    }

    @Override
    void openDoor() {
        television.turnOnTV();
    }

    @Override
    void closeDoor() {
        television.turnOffTV();
    }

    @Override
    void work() {
        television.selectChannel();
    }
}
