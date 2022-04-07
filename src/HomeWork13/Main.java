package HomeWork13;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Fence fence = new Fence(2,3);
        Tower tower = new Tower(3,4);
        Soldier soldier = new Soldier(5,6);
        Tank tank = new Tank(2,7);

        List<Unit> units = new ArrayList<>();

        units.add(fence);
        units.add(tower);
        units.add(soldier);
        units.add(tank);

        draw(units);

    }

    public static void draw(List<Unit> units ){
        for (Unit unit : units) {
            unit.draw();
        }

    }
}
