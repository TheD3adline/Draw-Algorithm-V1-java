package at.bbrz.uebungen.drawer;

public class BoxDrawer implements Drawable {

    @Override
    public void draw(Rectangle rectangle) {
        for(int i = 0; i < rectangle.getHeight(); i++) {
            for(int j = 0; j < rectangle.getWidth(); j++) {
                if(i == 0 || i == (rectangle.getHeight() - 1)) {
                    System.out.print("X");
                } else {
                    if(j == 0 || j == (rectangle.getWidth() - 1)) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}