import comp127graphics.CanvasWindow;

public class RightTunnelAlive {

    private StoryHelper storyHelper;
    private CanvasWindow canvas;

    RightTunnelAlive(CanvasWindow canvas){
        this.canvas = canvas;
        this.storyHelper = new StoryHelper(canvas);
    }

    /*When it comes to all the methods in this class they all follow a
    * similiar structure. They use the story helper class to call a method that will
    * allow the user to see a text of the current scenario, a new canvas background giving
    * context, and two options on where the user now wants to go. Following each button press
    * the user will be redirected to another canvas that follows this same pattern. This is done
    * over and over again until the user either dies, chooses a quick ending, or makes it out of the cave*/

    /*The first scene when the user chooses the right tunnel*/
    public void rightTunnel(){
        storyHelper.canvasHelper("You've just entered through the right cave and you see a wide underground river." +
                        " Do you want to swim across or find another way?",
                "Swim Across",
                "Find Another Way", "rightTunnelPhotos/rightTunnelPic.png");
        storyHelper.firstChoice.onClick(this::swimAcross);
        storyHelper.secondChoice.onClick(this::findAnotherWay);
    }
    /*The scene where the user chooses to swim across*/
    private void swimAcross(){
        storyHelper.canvasHelper("You're swimming across the river and you begin to see bubbles ahead of you.  " +
                        "Do you check underwater or keep swimming?. ",
                "Check Underwater",
                "Keep Swimming",
                "rightTunnelPhotos/swimAcrossPic.png");
        storyHelper.firstChoice.onClick(this::checkUnderwater);
        storyHelper.secondChoice.onClick(this::keepSwimming);
    }
    /*The scene where the user chooses to keep swimming*/
    private void keepSwimming(){
        storyHelper.canvasHelper("You were swimming alone but little did you know that the bubbles were a group of piranhas.  " +
                        "Now you're...sleeping with the fishes.",
                "Restart",
                "null",
                "rightTunnelPhotos/keepSwimmingPic.png");
        restart();
    }
    /*The scene where the user chooses to check underwater*/
    private void checkUnderwater(){
        storyHelper.canvasHelper("After looking underwater you see that there is a herd of piranhas headed your direction.  " +
                        "THEY LOOK HUNGRY. " + "Do you swim faster or play dead?",
                "Swim Faster",
                "Play Dead",
                "rightTunnelPhotos/checkUnderwaterPic.png");
        storyHelper.firstChoice.onClick(this::swimFaster);
        storyHelper.secondChoice.onClick(this::playDead);
    }
    /*The scene where the user chooses to play dead*/
    private void playDead(){
        storyHelper.canvasHelper("Your many years on the scouts never prepared you for this moment.  " +
                        "Playing dead may have worked with a bear, but now you're not playing dead anymore. " + "YOU ARE DEAD.",
                "Restart",
                "null",
                "rightTunnelPhotos/playDeadPic.png");
        restart();
    }
    /*The scene where the user chooses to swim faster*/
    private void swimFaster(){
        storyHelper.canvasHelper("People used to make fun of you for taking water aerobics at your local YMCA, but not anymore. " +
                        "The piranhas have suddenly stopped. " + "A currents swepted you! What now? " ,
                "Flow with",
                "Fight it",
                "rightTunnelPhotos/swimFasterPic.png");
        storyHelper.firstChoice.onClick(this::flowWithCurrent);
        storyHelper.secondChoice.onClick(this::fightCurrent);
    }
    /*The scene where the user chooses to fight the current*/
    private void fightCurrent(){
        storyHelper.canvasHelper("All those years at the academy wasted! Everyone knows the first rule of currents is not to fight it.  " +
                        "You've tired yourself out and collapsed. You probably should have had breakfast. ",
                "Restart",
                "null",
                "rightTunnelPhotos/fightCurrentPic.png");
        restart();
    }
    /*The scene where the user chooses to flow with the current*/
    private void flowWithCurrent(){
        storyHelper.canvasHelper("You're flowing along the river dodging rocks as they come by. You're a natural!!  " +
                        "You begin to hear a roaring noise and feel your gut wrench. It's a waterfall. " + "You see a tree branch or a rock that could stop you from falling what do you do? ",
                "Grab Branch",
                "Grab Rock",
                "rightTunnelPhotos/flowWithCurrentPic.png");
        storyHelper.firstChoice.onClick(this::grabBranch);
        storyHelper.secondChoice.onClick(this::grabRock);
    }
    /*The scene where the user chooses to grab the rock*/
    private void grabRock(){
        storyHelper.canvasHelper("You grab the rock but the water makes it to slippery to hold on.  " +
                        "You get closer and closer to the edge of the waterfall until you finally fall over. " +
                        "You probably should have worn a life jacket. ",
                "Restart",
                "null",
                "rightTunnelPhotos/grabRockPic.png");
        restart();
    }
    /*The scene where the user chooses to grab the branch*/
    private void grabBranch(){
        storyHelper.canvasHelper("You grab the branch in the nick of time and pull yourself up.  " +
                        "As you pull yourself toward the earth you see a light. You're freezing from the water. ",
                "Follow Light",
                "Stay by Water",
                "rightTunnelPhotos/grabBranchPic.png");
        storyHelper.firstChoice.onClick(this::followLight);
        storyHelper.secondChoice.onClick(this::stayWithWater);
    }
    /*The scene where the user chooses to follow the light resulting in one of the four true endings*/
    private void followLight(){
        storyHelper.canvasHelper("You walk outside and find yourself a log cabin with the chimney smoking.   " +
                        "Grandma is making cookies and you're right on time. ",
                "Restart",
                "null",
                "rightTunnelPhotos/followLightPic.png");
        restart();
    }
    /*The scene where the user chooses to stay with the water*/
    private void stayWithWater(){
        storyHelper.canvasHelper("As you're sitting by the water you've realized the adrenaline has worn off and you're starting to feel colder and more tired.  " +
                        "You decided to take nap but never wake up.",
                "Restart",
                "null",
                "rightTunnelPhotos/stayWithWaterPic.png");
        restart();
    }
    /*The scene where the user chooses to find another way*/
    private void findAnotherWay(){
        storyHelper.canvasHelper("You follow a path up the river looking for a way out, while you do you see two branching paths. " +
                        " One with the faint sound of birds and the other with wood planks. " +
                        "Where do you go?",
                "Follow Birds",
                "Wooden Path",
                "rightTunnelPhotos/findAnotherWayPic.png");
        storyHelper.firstChoice.onClick(this::followBirds);
        storyHelper.secondChoice.onClick(this::woodenPath);
    }
    /*The scene where the user chooses to follow the birds*/
    private void followBirds(){
        storyHelper.canvasHelper("You follow the birds and hear their chirping and singing. " +
                        "You're whistling with until you realize you're feeling dizzy. " + " It turns out the birds were used by miners to detect CO2. " +
                        "You just carbon monoxDIED.",
                "Restart",
                "null",
                "rightTunnelPhotos/followBirdsPic.png");
        restart();
    }
    /*The scene where the user chooses to walk the wooden path*/
    private void woodenPath(){
        storyHelper.canvasHelper("As you're walking down the path you begin to see a light.  " +
                        "You quint and begin to wonder what it is. " + "When you get closer you realize it's a small golden statue. " +
                        "It doesn't belong to you, but who would miss it?",
                "Grab Statue",
                "Look for Clues",
                "rightTunnelPhotos/woodenPathPic.png");
        storyHelper.firstChoice.onClick(this::grabStatue);
        storyHelper.secondChoice.onClick(this::lookForClues);
    }
    /*The scene where the user chooses to grab the statue*/
    private void grabStatue(){
        storyHelper.canvasHelper("You grab the statue only to realize you've triggered a trap. " +
                        "The doors get locked. " + "Snakes start to appear" +
                        "Hopefully they're not poisonous",
                "Restart",
                "null",
                "rightTunnelPhotos/grabStatuePic.png");
        restart();
    }
    /*The scene where the user chooses to look for clues*/
    private void lookForClues(){
        storyHelper.canvasHelper("You keep looking around the room you've entered and you've realized that this is an abandoned mine. " +
                        "You see a mine cart do you get in it or take a smoke break? ",
                "Smoke",
                "Get in Cart",
                "rightTunnelPhotos/lookForCluesPic.png");
        storyHelper.firstChoice.onClick(this::startSmoking);
        storyHelper.secondChoice.onClick(this::getInCart);
    }
    /*The scene where the user chooses to start smoking*/
    private void startSmoking(){
        storyHelper.canvasHelper("You take a break and start smoking, you're Marlboro man, but not for much longer. " +
                        "When you dump your ashes you realize you lit some dynamite by accident. " + "People always said smoking will kill you, but not like this.",
                "Restart",
                "null",
                "rightTunnelPhotos/startSmokingPic.png");
        restart();
    }
    /*The scene where the user chooses to get in the cart*/
    private void getInCart(){
        storyHelper.canvasHelper("You get in the cart and before it's too late its start to chug down the tracks." +
                        "You're flying past path after path. " + "You decide you need to choose a path to stop this decent.",
                "Push Lever",
                "Pull Lever",
                "rightTunnelPhotos/getInCartPic.png");
        storyHelper.firstChoice.onClick(this::pushLever);
        storyHelper.secondChoice.onClick(this::pullLever);
    }
    /*The scene where the user chooses to push the lever*/
    private void pushLever(){
        storyHelper.canvasHelper("You pushed the lever and your handle breaks. " +
                        "You're headed straight for lava. You should have brought some marshmallows",
                "Restart",
                "null",
                "rightTunnelPhotos/pushLeverPic.png");
        restart();
    }
    /*The scene where the user chooses to pull the lever*/
    private void pullLever(){
        storyHelper.canvasHelper("You pull the lever and veer to the right. " +
                        "You're headed down a path and you're getting faster and faster. " + "You must be going at least 50mph. " +
                        "You see penny in the cart. It's shiny.",
                "Keep Going",
                "Grab Penny",
                "rightTunnelPhotos/pullLeverPic.png");
        storyHelper.firstChoice.onClick(this::keepGoing);
        storyHelper.secondChoice.onClick(this::grabPenny);
    }
    /*The scene where the user chooses to keep going*/
    private void keepGoing(){
        storyHelper.canvasHelper("You're going so fast your eyes are watering. " +
                        "You keep looking forward and BOOM." + "You hit your forehead on a caution sign and get a coma." +
                        "There was no real heads up for that one. ",
                "Restart",
                "null",
                "rightTunnelPhotos/keepGoingPic.png");
        restart();
    }
    /*The scene where the user chooses to grab the penny resulting in one of the four true endings*/
    private void grabPenny(){
        storyHelper.canvasHelper("You reach down and grab the penny just in time to miss hitting your head. " +
                        "You keep going and fly off a ramp. " + "You've landed on a beach just in time for your friends birthday party. " +
                        "You think it's finally time for a drink.",
                "Restart",
                "null",
                "rightTunnelPhotos/grabPennyPic.png");
        restart();
    }
    /*This method restarts the game to the beginning when an ending is reached*/
    public void restart(){
        StartGame startGame = new StartGame(canvas);
        storyHelper.firstChoice.onClick(startGame::startGame);
    }
}
