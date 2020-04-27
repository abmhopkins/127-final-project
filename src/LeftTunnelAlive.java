import comp127graphics.CanvasWindow;

public class LeftTunnelAlive {

    private StoryHelper storyHelper;

    LeftTunnelAlive(CanvasWindow canvas){
        this.storyHelper = new StoryHelper(canvas);
    }

    public void leftTunnel(){
        storyHelper.canvasHelper("You choose the left tunnel. Up ahead you see a rope bridge and a rope ladder hanging " +
                "down from the ceiling. Do you want to cross the bridge or go up the ladder?",
                "Across the Bridge",
                "Up the Ladder" );
        storyHelper.firstChoice.onClick(this::bridge);
        storyHelper.secondChoice.onClick(this::ladder);
    }

    private void bridge(){
        storyHelper.canvasHelper("You cross the rickety old rope bridge carefully and make it to the other side. " +
                        "Now on the other side, you see that the cave splits again. " +
                        "You can either take the left tunnel or the right tunnel.",
                "Left Tunnel",
                "Right Tunnel" );
//        firstChoice.onClick();
//        secondChoice.onClick();
    }

    private void ladder(){
        storyHelper.canvasHelper("You climb the ladder and find yourself on the edge of a sewer pipe. \n" +
                        "This is a good start, you must be close to the surface! The sewer water is flowing from " +
                        "left to right, do you want to go with the flow or against the flow?" ,
                "With the Flow",
                "Against the Flow");
//        firstChoice.onClick();
//        secondChoice.onClick();
    }



}
