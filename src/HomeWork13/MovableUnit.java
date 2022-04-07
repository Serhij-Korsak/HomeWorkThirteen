package HomeWork13;

public abstract class MovableUnit extends Unit{

    public MovableUnit(int x, int y) {
        super(x, y);
    }

    public void reload(){
        System.out.println("Reload!");
    }

    public void fire() {
        System.out.println("Fire!");
    }
    public void move(){}
}
