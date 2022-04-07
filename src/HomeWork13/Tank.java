package HomeWork13;

import java.io.Serializable;

public class Tank extends Soldier implements Cloneable, Serializable, Immortal {

    public Tank(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw() {
        System.out.println("This is a Tank.");
    }

    public void reload() {
        System.out.println("Reload!");
    }

    public void fire(){
        System.out.println("Fire!");
    }

    public void move(){
    }
}
