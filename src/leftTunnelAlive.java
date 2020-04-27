import comp127graphics.CanvasWindow;
import comp127graphics.GraphicsText;
import comp127graphics.ui.Button;

public class leftTunnelAlive {

    private final int CANVAS_WIDTH;
    private final int CANVAS_HEIGHT;

    private CanvasWindow canvas;
    private GraphicsText story;

    private Button firstChoice;
    private Button secondChoice;

    leftTunnelAlive(CanvasWindow canvas){
        this.canvas = canvas;
        this.CANVAS_WIDTH = canvas.getWidth();
        this.CANVAS_HEIGHT = canvas.getHeight();
    }

    public void leftTunnel(){
        canvasHelper("You choose the left tunnel, up ahead you see rope bridge and a rope ladder hanging " +
                "down from the ceiling. Do you want to cross the bridge or go up the ladder?",
                "Across the Bridge",
                "Up the Ladder" );
        firstChoice.onClick(this::bridge);
        secondChoice.onClick(this::ladder);
    }

    private void bridge(){
        canvasHelper("You cross the rickety old rope bridge carefully and make it to the other side. " +
                        "Now on the other side, you see that the cave splits again. " +
                        "You can either take the left tunnel or the right tunnel.",
                "Left Tunnel",
                "Right Tunnel" );
//        firstChoice.onClick();
//        secondChoice.onClick();
    }

    private void ladder(){
        canvasHelper("You climb the ladder and find yourself on the edge of a sewer pipe. \n" +
                        "This is a good start, you must be close to the surface! The sewer water is flowing from " +
                        "left to right, do you want to go with the flow or against the flow?" ,
                "With the Flow",
                "Against the Flow");
//        firstChoice.onClick();
//        secondChoice.onClick();
    }

    public void canvasHelper(String storyText, String choice1, String choice2){
        canvas.removeAll();
        story = new GraphicsText(storyText);
        story.setCenter(CANVAS_WIDTH*0.5, CANVAS_HEIGHT*0.33);
        canvas.add(story);

        firstChoice = new Button(choice1);
        firstChoice.setCenter(CANVAS_WIDTH*0.5,CANVAS_HEIGHT*0.6);
        canvas.add(firstChoice);

        secondChoice = new Button(choice2);
        secondChoice.setCenter(CANVAS_WIDTH*0.5,CANVAS_HEIGHT*0.7);
        canvas.add(secondChoice);
    }

}
