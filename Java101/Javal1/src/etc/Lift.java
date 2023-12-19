package etc;

import java.util.ArrayList;

public class Lift {
    private int floor;
    private LiftState liftState;
    private int liftCurrentFloor;
    private final ArrayList<Integer> floors = new ArrayList<>();
    public void goUp(){
        System.out.println("Lift goes up!");
    }
    public void goDown(){
        System.out.println("Lift goes down!");
    }
    public boolean isLiftUp(){
        return true;
    }
    public void callLift(int floor){
        floors.add(floor);
    }
}
