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
    private Button firstChoice;
    private Button secondChoice;

    private leftTunnelAlive leftTunnel;


    private GraphicsText story;

    public caveEscape() {
        canvas = new CanvasWindow("Cave Escape", CANVAS_WIDTH, CANVAS_HEIGHT);
        canvas.setBackground(Color.WHITE);
        Button startGameButton = new Button("Start Game");

        startGameButton.setCenter(CANVAS_WIDTH*0.5,CANVAS_HEIGHT*0.5);
        startGameButton.onClick(this::startGame);
        canvas.add(startGameButton);

        leftTunnel = new leftTunnelAlive(canvas);
        }

    public void startGame(){
        canvasHelper("You awake in a dark room. What do you want to do: Feel Around or Do Nothing?",
                "Feel Around",
                "Do Nothing");
        firstChoice.onClick(this::feelAround);
        secondChoice.onClick(this::doNothing);
    }

    private void feelAround(){
        canvasHelper("You feel the ground around you. You find a backpack and a flashlight. " +
                "Do you want to turn on the flashlight or check your backpack?",
                "Flashlight",
                "Backpack");
        firstChoice.onClick(this::flashlight);
//        secondChoice.onClick();
    }

    public void doNothing(){
        canvasHelper("You sit there on the cold dark floor and do nothing. That wasn't much fun was it?" +
                        "GAME OVER",
                "Restart",
                "null");
        firstChoice.onClick(this::startGame);
    }

    private void flashlight(){
        canvasHelper("Your fingers stumble over the flashlight searching for the button. " +
                "You find it and the path in front of you is illuminated. There are two tunnels, a left " +
                "tunnel and a right tunnel",
                "Left Tunnel",
                "Right Tunnel");
        firstChoice.onClick(() -> leftTunnel.leftTunnel());
    }

    private void canvasHelper(String storyText, String choice1, String choice2){
        canvas.removeAll();
        story = new GraphicsText(storyText);
        story.setCenter(CANVAS_WIDTH*0.5, CANVAS_HEIGHT*0.33);
        canvas.add(story);

        firstChoice = new Button(choice1);
        firstChoice.setCenter(CANVAS_WIDTH*0.5,CANVAS_HEIGHT*0.6);
        canvas.add(firstChoice);
        if (!choice2.equals("null")) {
            secondChoice = new Button(choice2);
            secondChoice.setCenter(CANVAS_WIDTH * 0.5, CANVAS_HEIGHT * 0.7);
            canvas.add(secondChoice);
        }
    }


    public static void main(String[] args) {
        new caveEscape();
    }
}
