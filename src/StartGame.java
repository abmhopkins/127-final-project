import comp127graphics.CanvasWindow;

public class StartGame {

    private StoryHelper storyHelper;
    private LeftTunnelAlive leftTunnel;
    private RightTunnelAlive rightTunnel; //Amrit

    public StartGame(CanvasWindow canvas){
        this.storyHelper = new StoryHelper(canvas);
        leftTunnel = new LeftTunnelAlive(canvas);
        rightTunnel = new RightTunnelAlive(canvas); //Amrit
    }

    public void startGame(){
        storyHelper.canvasHelper("You awake in a dark room. What do you want to do: Feel Around or Do Nothing?",
                "Feel Around",
                "Do Nothing",
                "null");
        //TODO image
        storyHelper.firstChoice.onClick(this::feelAround);
        storyHelper.secondChoice.onClick(this::doNothing);
    }

    private void feelAround(){
        storyHelper.canvasHelper("You feel the ground around you. You find a backpack and a flashlight. " +
                        "Do you want to turn on the flashlight or check your backpack?",
                "Flashlight",
                "Backpack",
                "null");
        //TODO image
        storyHelper.firstChoice.onClick(this::flashlight);
//        secondChoice.onClick();
    }

    public void doNothing(){
        storyHelper.canvasHelper("You sit there on the cold dark floor and do nothing. That wasn't much fun was it?",
                "Restart",
                "null",
                "null");
        //TODO image
        storyHelper.firstChoice.onClick(this::startGame);
    }

    private void flashlight(){
        storyHelper.canvasHelper("Your fingers stumble over the flashlight searching for the button. " +
                        "You find it and the path in front of you is illuminated. There are two tunnels, a left " +
                        "tunnel and a right tunnel.",
                "Left Tunnel",
                "Right Tunnel",
                "null");
        //TODO image
        storyHelper.firstChoice.onClick(leftTunnel::leftTunnel);
        storyHelper.secondChoice.onClick(rightTunnel::rightTunnel);
    }
}
