package HomeWork13;

public class Soldier extends MovableUnit{

    public Soldier(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw() {
        System.out.println("This is a Soldier.");
    }

    public void fire(){
        System.out.println("Fire!");
    }

    public void move(){
    }
}
