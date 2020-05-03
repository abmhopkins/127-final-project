import comp127graphics.CanvasWindow;

/**
 * This is the class that deals with the first portion of the game. After the uses chooses to start a game
 * they will be put in the scenario below until they are asked to choose from either a right tunnel or left tunnel.
 * Afterwards, this class will redirect them into one of the two scenarios and they will attempt to reach one of the
 * four true endings or any of the others
 *
 * Authors: Amrit Johal and Alexander Hopkins
 *
 */
public class StartGame {

    private StoryHelper storyHelper;
    private LeftTunnelAlive leftTunnel;
    private RightTunnelAlive rightTunnel;

    /**
     * Creates a StartGame object.
     *
     * @param canvas A canvas window object that is used to initialize the StoryHelper object
     */
    public StartGame(CanvasWindow canvas){
        this.storyHelper = new StoryHelper(canvas);
        leftTunnel = new LeftTunnelAlive(canvas);
        rightTunnel = new RightTunnelAlive(canvas);
    }

    /**
     * Displays the initial story
     *
     */
    public void startGame(){
        storyHelper.canvasHelper("You awake in a dark space and are confused, it feels damp and smells. " +
                        "Is this heaven? ",
                "Feel Around",
                "Do Nothing",
                "startGamePhotos/dark-floor.png");
        storyHelper.firstChoice.onClick(this::feelAround);
        storyHelper.secondChoice.onClick(this::doNothing);
    }

    /**
     * This is what will help you see the rest of the game
     *
     */
    private void feelAround(){
        storyHelper.canvasHelper("You feel the ground around you. You find a flashlight (or a torch if you lost" +
                        " the revolutionary war). " +  "Do you want to turn on the flashlight/torch?",
                "Flashlight",
                "null",
                "startGamePhotos/flashlight.png");
        storyHelper.firstChoice.onClick(this::flashlight);
    }

    /**
     * This class is one of the first deaths and if choosen will direct you to try again
     *
     */
    public void doNothing(){
        storyHelper.canvasHelper("You sit there on the cold dark floor and do nothing. That wasn't heaven," +
                        " but after starving you're definitely close. R.I.P",
                "Restart",
                "null",
                "startGamePhotos/dark-floor.png");
        storyHelper.firstChoice.onClick(this::startGame);
    }
    /**
     * This is the first major decision of the game that will ask the user which branch
     * and path they would like to follow.
     *
     */
    private void flashlight(){
        storyHelper.canvasHelper("Your fingers stumble over the flashlight searching for the button. " +
                        "You find it and the path in front of you is illuminated. There are two tunnels, a left " +
                        "tunnel and a right tunnel.",
                "Left Tunnel",
                "Right Tunnel",
                "startGamePhotos/options.png");
        storyHelper.firstChoice.onClick(leftTunnel::leftTunnel);
        storyHelper.secondChoice.onClick(rightTunnel::rightTunnel);
    }
}
