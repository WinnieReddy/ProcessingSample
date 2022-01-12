import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int HEIGHT = 640;
    public static final int WIDTH = 480;
    public static final int C = 20;
    int x =0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);

    }

    @Override
    public void settings() {
        super.settings();
        size(640, 500);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        ellipse(x,WIDTH/4, C,C);
        ellipse(x*2,WIDTH/2, C,C);
        ellipse(x*3,3*WIDTH/4, C,C);
        ellipse(x*4,WIDTH, C,C);
        x++;
    }
}
