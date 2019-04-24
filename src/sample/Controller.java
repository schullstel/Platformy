package sample;

import javafx.event.ActionEvent;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.util.Random;

public class Controller {

    private Stage stage;
    private Rectangle2D primaryScreenBounds;

    public Controller() {
        this.primaryScreenBounds = Screen.getPrimary().getVisualBounds();
    }

    private static int getRandomNumberInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    private int getRandomY() {
        return Controller.getRandomNumberInRange(
                (int) this.primaryScreenBounds.getMinY(),
                (int) this.primaryScreenBounds.getMaxY() - 100
        );
    }

    private int getRandomx() {
        return Controller.getRandomNumberInRange(
                (int) this.primaryScreenBounds.getMinX(),
                (int) this.primaryScreenBounds.getMaxX() - 100
        );
    }

    public void aloneButtonClick(ActionEvent actionEvent) {
        stage.setX(this.getRandomx());
        stage.setY(this.getRandomY());
    }


    public void setStage(Stage getStage) {
        this.stage = getStage;
    }


}
