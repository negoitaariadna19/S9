package State;

public class Livrat implements State{

    @Override
    public void updateState(ComandaMancare c) {
        System.out.println("Mancarea a fost livrata");
    }
}
