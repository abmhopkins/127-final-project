import comp127graphics.CanvasWindow;

public class RightTunnelAlive {

    private StoryHelper storyHelper;
    private CanvasWindow canvas;

    RightTunnelAlive(CanvasWindow canvas){
        this.canvas = canvas;
        this.storyHelper = new StoryHelper(canvas);
    }
    public void rightTunnel(){
        storyHelper.canvasHelper("You've just entered through the right cave and you see a wide underground river." +
                        " Do you want to swim across or find another way?",
                "Swim Across",
                "Find Another Way",
                "null");
        //TODO image
        storyHelper.firstChoice.onClick(this::swimAcross);
        storyHelper.secondChoice.onClick(this::findAnotherWay);
    }
    private void swimAcross(){
        storyHelper.canvasHelper("You're swimming across the river and you begin to see bubbles ahead of you.  " +
                        "Do you check underwater or keep swimming?. ",
                "Check Underwater",
                "Keep Swimming",
                "null");
        //TODO image
        storyHelper.firstChoice.onClick(this::checkUnderwater);
        storyHelper.secondChoice.onClick(this::keepSwimming);
    }
    private void keepSwimming(){
        storyHelper.canvasHelper("You were swimming alone but little did you know that the bubbles were a group of piranhas.  " +
                        "Now you're...sleeping with the fishes.",
                "Restart",
                "null",
                "null");
        //TODO image
        restart();
    }
    private void checkUnderwater(){
        storyHelper.canvasHelper("After looking underwater you see that there is a herd of piranhas headed your direction.  " +
                        "THEY LOOK HUNGRY. " + "Do you swim faster or play dead?",
                "Swim Faster",
                "Play Dead",
                "null");
        //TODO image
        storyHelper.firstChoice.onClick(this::swimFaster);
        storyHelper.secondChoice.onClick(this::playDead);
    }
    private void playDead(){
        storyHelper.canvasHelper("Your many years on the scouts never prepared you for this moment.  " +
                        "Playing dead may have worked with a bear, but now you're not playing dead anymore. " + "YOU ARE DEAD.",
                "Restart",
                "null",
                "null");
        //TODO image
        restart();
    }
    private void swimFaster(){
        storyHelper.canvasHelper("People used to make fun of you for taking water aerobics at the local YMCA, but they're laughing now.  " +
                        "ou're out swimming the piranhas and suddenly they've stopped. Why? " + "Well it's because you've been swept by a strong current!! What are you gonna do? " +
                "Fight it or let it take you?",
                "Flow with",
                "Fight it",
                "null");
        //TODO image
        storyHelper.firstChoice.onClick(this::flowWithCurrent);
        storyHelper.secondChoice.onClick(this::fightCurrent);
    }
    private void fightCurrent(){
        storyHelper.canvasHelper("All those years at the academy wasted! Everyone knows the first rule of currents is not to fight it.  " +
                        "You've tired yourself out and collapsed. You probably should have had breakfast. ",
                "Restart",
                "null",
                "null");
        //TODO image
        restart();
    }
    private void flowWithCurrent(){
        storyHelper.canvasHelper("You're flowing along the river dodging rocks as they come by. You're a natural!!  " +
                        "You begin to hear a roaring noise and feel your gut wrench. It's a waterfall. " + "You see a tree branch or a rock that could stop you from falling what do you do? ",
                "Grab Branch",
                "Grab Rock",
                "null");
        //TODO image
        storyHelper.firstChoice.onClick(this::grabBranch);
        storyHelper.secondChoice.onClick(this::grabRock);
    }
    private void grabRock(){
        storyHelper.canvasHelper("ou grab the rock but the water makes it to slippery to hold on.  " +
                        "You get closer and closer to the edge of the waterfall until you finally fall over. " +
                        "You probably should have worn a life jacket. ",
                "Restart",
                "null",
                "null");
        //TODO image
        restart();
    }
    private void grabBranch(){
        storyHelper.canvasHelper("You grab the branch in the nick of time and pull yourself up.  " +
                        "As you pull yourself toward the earth you see a light. You're freezing from the water. ",
                "Follow Light",
                "Stay by Water",
                "null");
        //TODO image
        storyHelper.firstChoice.onClick(this::followLight);
        storyHelper.secondChoice.onClick(this::stayWithWater);
    }
    private void followLight(){
        storyHelper.canvasHelper("You walk outside and find yourself a log cabin with the chimney smoking.   " +
                        "Grandma is making cookies and you're right on time. ",
                "Restart",
                "null",
                "null");
        //TODO image
        restart();
    }
    private void stayWithWater(){
        storyHelper.canvasHelper("As you're sitting by the water you've realized the adrenaline has worn off and you're starting to feel colder and more tired.  " +
                        "You decided to take nap but never wake up.",
                "Restart",
                "null",
                "null");
        //TODO image
        restart();
    }

    private void findAnotherWay(){
        storyHelper.canvasHelper("You follow a path up the river looking for a way out, while you do you see two branching paths. " +
                        " One with the faint sound of birds and the other with wood planks. " +
                        "Where do you go?",
                "Follow Birds",
                "Wooden Path",
                "null");
        //TODO image
        storyHelper.firstChoice.onClick(this::followBirds);
        storyHelper.secondChoice.onClick(this::woodenPath);
    }
    private void followBirds(){
        storyHelper.canvasHelper("While you follow the birds you hear they're chirping and singing.  " +
                        "You're whistling with them when you realize you're feeling dizzy. " + "It turns out the birds were used by miners to detect CO2." +
                "It seems you just carbon monoxDIED.",
                "Restart",
                "null",
                "null");
        //TODO image
        restart();
    }
    private void woodenPath(){
        storyHelper.canvasHelper("As you're walking down the path you begin to see a light.  " +
                        "You quint and begin to wonder what it is. " + "When you get closer you realize it's a small golden statue. " +
                "It doesn't belong to you, but who would miss it?",
                "Grab Statue",
                "Look for Clues",
                "null");
        //TODO image
        storyHelper.firstChoice.onClick(this::grabStatue);
        storyHelper.secondChoice.onClick(this::lookForClues);
    }
    private void grabStatue(){
        storyHelper.canvasHelper("You grab the statue only to realize you've triggered a trap. " +
                        "Water starts to fill the room and the doors get locked. " + "Even snakes would have been better with this." +
                        "Hopefully you can hold your breath for a long long time.",
                "Restart",
                "null",
                "null");
        //TODO image
        restart();
    }
    private void lookForClues(){
        storyHelper.canvasHelper("You keep looking around the room you've entered and you've realized that this is an abandoned mine. " +
                        "You see a mine cart do you get in it or take a smoke break? ",
                "Smoke",
                "Get in Cart",
                "null");
        //TODO image
        storyHelper.firstChoice.onClick(this::startSmoking);
        storyHelper.secondChoice.onClick(this::getInCart);
    }
    private void startSmoking(){
        storyHelper.canvasHelper("You take a break and start smoking, you're Marlboro man, but not for much longer. " +
                        "When you dump your ashes you realize you lit some dynamite by accident. " + "People always said smoking will kill you, but not like this.",
                "Restart",
                "null",
                "null");
        //TODO image
        restart();
    }
    private void getInCart(){
        storyHelper.canvasHelper("You get in the cart and before it's too late its start to chug down the tracks." +
                        "You're flying past path after path. " + "You decide you need to choose a path to stop this decent.",
                "Push Lever",
                "Pull Lever",
                "null");
        //TODO image
        storyHelper.firstChoice.onClick(this::pushLever);
        storyHelper.secondChoice.onClick(this::pullLever);
    }
    private void pushLever(){
        storyHelper.canvasHelper("You pushed the lever and your cart veers to the left. " +
                        " You're headed straight for a wall. Now you know how Wile E Coyote felt.",
                "Restart",
                "null",
                "null");
        //TODO image
        restart();
    }
    private void pullLever(){
        storyHelper.canvasHelper("You pull the lever and veer to the right. " +
                        "You're headed down a path and you're getting faster and faster. " + "You must be going at least 50mph. " +
                "You see penny in the cart. It's shiny.",
                "Keep Going",
                "Grab Penny",
                "null");
        //TODO image
        storyHelper.firstChoice.onClick(this::keepGoing);
        storyHelper.secondChoice.onClick(this::grabPenny);
    }
    private void keepGoing(){
        storyHelper.canvasHelper("You're going so fast your eyes are watering. " +
                        "You keep looking forward and BOOM." + "You hit your forehead on a caution sign and get a coma." +
                "There was no real heads up for that one. ",
                "Restart",
                "null",
                "null");
        //TODO image
        restart();
    }
    private void grabPenny(){
        storyHelper.canvasHelper("You reach down and grab the penny just in time to miss hitting your head. " +
                        "You keep going and fly off a ramp. " + "You've landed on a beach just in time for your friends birthday party. " +
                "You think it's finally time for a drink.",
                "Restart",
                "null",
                "null");
        //TODO image
        restart();
    }
    public void restart(){
        StartGame startGame = new StartGame(canvas);
        storyHelper.firstChoice.onClick(startGame::startGame);
    }
}
