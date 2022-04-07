package HomeWork13;

public class Tower extends Unit implements Immortal{
    public Tower (int x, int y){
        super(x,y);
    }

    @Override
    public void draw() {
        System.out.println("This is a Tower.");
    }
}
