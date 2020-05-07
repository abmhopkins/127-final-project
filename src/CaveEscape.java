import comp127graphics.*;

import comp127graphics.CanvasWindow;
import comp127graphics.ui.Button;
import java.awt.Color;

/**
 * The main class of the cave escape game, displays a canvas with the start screen.
 * <p>
 * Author: Amrit Johal and Alexander Hopkins
 * Original Work
 */
public class CaveEscape {
    private CanvasWindow canvas;

    private static final int CANVAS_WIDTH = 750;
    private static final int CANVAS_HEIGHT = 500;

    private StartGame startGame;


    /**
     * This is the main class of the game Cave Escape. The constructor holds the details needed for the initial
     * starting page of the game. It then calls the start game method when the button is pressed to put the user
     * inside the game and begin their adventure.
     */
    public CaveEscape() {
        canvas = new CanvasWindow("Cave Escape", CANVAS_WIDTH, CANVAS_HEIGHT);
        canvas.setBackground(Color.WHITE);
        Image image = new Image(0, 0);
        image.setImagePath("startGamePhotos/titleScreenPic.png");
        canvas.add(image);
        startGame = new StartGame(canvas);
        Button startGameButton = new Button("Start Game");
        startGameButton.setCenter(CANVAS_WIDTH*0.5,CANVAS_HEIGHT*0.8);
        startGameButton.onClick(startGame::startGame);
        canvas.add(startGameButton);
        canvas.draw();
        }


    public static void main(String[] args) {
        new CaveEscape();
    }
}
