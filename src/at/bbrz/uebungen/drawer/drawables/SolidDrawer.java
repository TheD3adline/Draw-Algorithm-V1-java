package at.bbrz.uebungen.drawer.drawables;

import at.bbrz.uebungen.drawer.Rectangle;

public class SolidDrawer implements Drawable {

    @Override
    public void draw(Rectangle rectangle) {
        for (int i = 0; i < rectangle.getHeight(); i++) {
            for (int j = 0; j < rectangle.getWidth(); j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
}