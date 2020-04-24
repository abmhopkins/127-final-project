import comp127graphics.*;

import java.awt.*;

import comp127graphics.CanvasWindow;
import comp127graphics.ui.Button;
import java.awt.Color;

public class caveEscape {
    private CanvasWindow canvas;
    private stillGoingScenarios stillGoingScenarios;

    private static final int CANVAS_WIDTH = 750;
    private static final int CANVAS_HEIGHT = 500;


    private GraphicsText story;

    public caveEscape() {
        canvas = new CanvasWindow("Cave Escape", CANVAS_WIDTH, CANVAS_HEIGHT);
        canvas.setBackground(Color.WHITE);
        Button startGameButton = new Button("Start Game");

        startGameButton.setCenter(CANVAS_WIDTH*0.5,CANVAS_HEIGHT*0.5);
        startGameButton.onClick(() -> startGame());
        canvas.add(startGameButton);
        }

    public void startGame(){
        canvas.removeAll();
        story = new GraphicsText("You awake in a dark room. What do you want to do: Feel Around or Do Nothing?");
        story.setCenter(CANVAS_WIDTH*0.5, CANVAS_HEIGHT*0.33);
        canvas.add(story);

        Button feelAround = new Button("Feel Around");
        feelAround.setCenter(CANVAS_WIDTH*0.5,CANVAS_HEIGHT*0.6);
        canvas.add(feelAround);

        Button doNothing = new Button("Do Nothing");
        doNothing.setCenter(CANVAS_WIDTH*0.5,CANVAS_HEIGHT*0.7);
        canvas.add(doNothing);

    }

    public static void main(String[] args) {
        new caveEscape();
    }
}
