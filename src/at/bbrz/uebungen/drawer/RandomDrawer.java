package at.bbrz.uebungen.drawer;

public class RandomDrawer implements Drawable {

    @Override
    public void draw(Rectangle rectangle) {
        for(int i = 0; i < rectangle.getHeight(); i++) {
            for(int j = 0; j < rectangle.getWidth(); j++) {
                if(Math.random() < 0.5) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}