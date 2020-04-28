import comp127graphics.*;

import comp127graphics.CanvasWindow;
import comp127graphics.ui.Button;
import java.awt.Color;

public class CaveEscape {
    private CanvasWindow canvas;

    private static final int CANVAS_WIDTH = 750;
    private static final int CANVAS_HEIGHT = 500;

    private StartGame startGame;

    public CaveEscape() {
        canvas = new CanvasWindow("Cave Escape", CANVAS_WIDTH, CANVAS_HEIGHT);
        canvas.setBackground(Color.WHITE);

        startGame = new StartGame(canvas);

        Button startGameButton = new Button("Start Game");
        startGameButton.setCenter(CANVAS_WIDTH*0.5,CANVAS_HEIGHT*0.5);
        startGameButton.onClick(startGame::startGame);
        canvas.add(startGameButton);
        canvas.draw();
        }


    public static void main(String[] args) {
        new CaveEscape();
    }
}
