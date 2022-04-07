package HomeWork13;

public class Fence extends Unit implements Immortal{
    public Fence (int x, int y){
        super(x,y);
    }

    @Override
    public void draw() {
        System.out.println("This is a Fence.");
    }
}
