import comp127graphics.*;

import java.awt.*;

import comp127graphics.CanvasWindow;
import comp127graphics.ui.Button;
import java.awt.Color;



public class caveEscape {
    private CanvasWindow canvas;
    private stillGoingScenarios stillGoingScenarios;

    public caveEscape() {
        canvas = new CanvasWindow("Cave Escape", 500, 500);
        canvas.setBackground(Color.WHITE);
        Button startGameButton = new Button("Start Game");
        startGameButton.setCenter(250,400);
        canvas.add(startGameButton);
        }

    public static void main(String[] args) {
        new caveEscape();
    }
}
