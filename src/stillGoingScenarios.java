import comp127graphics.CanvasWindow;
import comp127graphics.ui.Button;

import java.awt.*;

public class stillGoingScenarios {

    public stillGoingScenarios(CanvasWindow canvas) {
        canvas.removeAll();
        canvas.setBackground(Color.WHITE);
        comp127graphics.ui.Button startGameButton = new Button("Left Button");
        startGameButton.setCenter(250,400);
        startGameButton.onClick(() -> startGameButton.setCenter(250,200));
        canvas.add(startGameButton);
    }
    public static void grabbedRope(CanvasWindow canvas){
        canvas.removeAll();
        canvas.setBackground(Color.BLACK);
        comp127graphics.ui.Button leftChoice = new Button("Left Choice");
        leftChoice.setCenter(250,400);
        comp127graphics.ui.Button rightChoice = new Button("Right Choice");
        rightChoice.setCenter(250,400);
    }
}
