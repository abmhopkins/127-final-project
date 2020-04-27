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

    private  leftTunnelAlive(CanvasWindow canvas){
        this.canvas = canvas;
        this.CANVAS_WIDTH = canvas.getWidth();
        this.CANVAS_HEIGHT = canvas.getHeight();
    }

    public void leftTunnel(){
        canvasHelper("You choose the left tunnel, up ahead you see rope bridge and a rope ladder hanging " +
                "down from the ceiling. Do you want to cross the bridge or go up the ladder?",
                "Across the Bridge",
                "Up the Ladder" );
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
