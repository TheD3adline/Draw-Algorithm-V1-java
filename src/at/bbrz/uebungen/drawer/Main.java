package at.bbrz.uebungen.drawer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserInput inputProcessor = new UserInput();
        List<Drawable> drawables = new ArrayList<>();
        drawables.add(new SolidDrawer());
        drawables.add(new BoxDrawer());
        drawables.add(new RandomDrawer());

        while(true) {
            inputProcessor.doInput();
            Rectangle rectangle = new Rectangle(inputProcessor.getWidth(), inputProcessor.getHeight());
            drawables.get(getRandomNumber(0, drawables.size())).draw(rectangle);
        }
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}