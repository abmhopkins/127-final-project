import comp127graphics.CanvasWindow;
import comp127graphics.Image;

public class LeftTunnelAlive {

    private StoryHelper storyHelper;
    private CanvasWindow canvas;

    LeftTunnelAlive(CanvasWindow canvas){
        this.canvas = canvas;
        this.storyHelper = new StoryHelper(canvas);
    }

    public void leftTunnel(){
        storyHelper.canvasHelper("You choose the left tunnel. Up ahead you see a rope bridge and a rope ladder hanging " +
                "down from the ceiling. Do you want to cross the bridge or go up the ladder?",
                "Across the Bridge",
                "Up the Ladder",
                "null");

        storyHelper.firstChoice.onClick(this::bridge);
        storyHelper.secondChoice.onClick(this::ladder);
    }

    private void bridge(){
        storyHelper.canvasHelper("You cross the rickety old rope bridge carefully and make it to the other side. " +
                        "Now on the other side, you see that the cave splits again. " +
                        "You can either take the left tunnel or the right tunnel.",
                "Left Tunnel",
                "Right Tunnel",
                "leftTunnelPhotos/cave.png");
        storyHelper.firstChoice.onClick(this::leftTunnelBridge);
        storyHelper.secondChoice.onClick(this::rightTunnelBridge);
    }

    private void leftTunnelBridge(){
        storyHelper.canvasHelper("You start heading down the tunnel to your left when a glint catches " +
                        "your eye. You head over to examine it some closer and see a little piece of gold lying " +
                        "on the floor. You shine your light and see another one not too far ahead. Do you ignore " +
                        "the trail or follow it?",
                "Ignore It",
                "Follow It",
                "leftTunnelPhotos/gold.png");
        storyHelper.firstChoice.onClick(this::ignoreIt);
        storyHelper.secondChoice.onClick(this::followIt);
    }

    private void rightTunnelBridge(){
        storyHelper.canvasHelper("You head down the tunnel on your right. Your flashlight begins to " +
                        "flicker and you briefly can't see your surroundings. You tumble down a hole, bumping " +
                        "your head on the way down. You awake surrounded by rats, who appear to be worshiping you. " +
                        "You live out the rest of your days as a rat monarch. GAME OVER",
                "Restart",
                "null",
                "leftTunnelPhotos/rats.png");
        restart();
    }

    private void ignoreIt(){
        storyHelper.canvasHelper("You ignore the gold pieces. They were probably fake anyway. " +
                        "You keep walking in the cave until you stop dead in your tracks. In front of you, " +
                        "you make out what appears to a massive grizzly bear. How did that get down here? " +
                        "You can either run past it or hide until it goes away.",
                "Run",
                "Hide",
                "leftTunnelPhotos/bear.png");
        storyHelper.firstChoice.onClick(this::run);
        storyHelper.secondChoice.onClick(this::hide);
    }

    private void followIt(){
        storyHelper.canvasHelper("You decide to follow the pieces of gold, picking them up as you go. " +
                        "The pieces lead you to a section of the cave that you never would have stumbled onto. " +
                        "You head down this new tunnel and come out into a room of treasure. You are immediately " +
                        "consumed by greed and a desire to remain with your treasure forever. GAME OVER",
                "Restart",
                "null",
                "leftTunnelPhotos/treasure.png");
        restart();
    }

    private void run(){
        storyHelper.canvasHelper("You decide to try and run past the bear. " +
                        "This idea sounded better in your head. You reach the other side of the cavern but " +
                        "the bear is hot on your heels. It catches you. GAME OVER",
                "Restart",
                "null",
                "leftTunnelPhotos/standing-bear.png");
        restart();
    }

    private void hide(){
        storyHelper.canvasHelper("You hide behind a rock and wait for the bear to move on. " +
                        "After about 20 minutes it scampers the way you just came and out of sight. " +
                        "You move to the end of the cavern. You see a light up ahead of you or you can " +
                        "head towards a darker part of the cave.",
                "Light",
                "Dark",
                "leftTunnelPhotos/light-dark.png");
        storyHelper.firstChoice.onClick(this::light);
        storyHelper.secondChoice.onClick(this::dark);
    }

    private void light(){
        storyHelper.canvasHelper("You break into a jog as you think you are close to the exit. " +
                        "You think you can hear the sound of the ocean. You reach a dead end. Hanging from the " +
                        "ceiling is an old miner's light. You break down and cry, exhausted. GAME OVER",
                "Restart",
                "null",
                "leftTunnelPhotos/light.png");
        restart();
    }

    private void dark(){
        storyHelper.canvasHelper("Interesting choice. \"Head towards the dark.\" Never heard that before. " +
                        "Maybe it's good advice though. You turn a corner and see the outside world for the " +
                        "first time. At the end of the cave opening is a rope. Do you want to climb up or down?",
                "Climb Up",
                "Climb Down",
                "leftTunnelPhotos/rope.png");
        storyHelper.firstChoice.onClick(this::climbUp);
        storyHelper.secondChoice.onClick(this::climbDown);
    }

    private void climbUp(){
        storyHelper.canvasHelper("You start to climb up the rope. It clearly has not been used for a " +
                        "long time and you see it begin to fray under your weight. Fearing for your life, you " +
                        "scramble up the rest of the rope and pull yourself onto level ground. You look around " +
                        "and recognize the view. You go for runs here sometimes, you know your way home. YOU WIN",
                "Restart",
                "null",
                "leftTunnelPhotos/view.png");
        restart();
    }

    private void climbDown(){
        storyHelper.canvasHelper("You start to repel down. About 10 meters down, your feet no longer " +
                        "feel the rope. You look down and see that the rope ends well before the ground does. " +
                        "Using one last push of energy you try to climb up the rope. " +
                        "You aren't strong enough. GAME OVER",
                "Restart",
                "null",
                "leftTunnelPhotos/rocks.png");
        restart();
    }

    private void ladder(){
        storyHelper.canvasHelper("You climb the ladder and find yourself on the edge of a sewer pipe." +
                        "This is a good start, you must be close to the surface! The sewer water is flowing from " +
                        "right to left, do you want to go with the flow or against the flow?" ,
                "With the Flow",
                "Against the Flow",
                "null");
        //TODO image
        storyHelper.firstChoice.onClick(this::withFlow);
        storyHelper.secondChoice.onClick(this::againstFlow);
    }

    public void withFlow(){
        storyHelper.canvasHelper("You walk forward 100 meters and see a sewer grate not far in front of you." +
                        " From behind you hear the roar of water. You turn just in time for it to hit you square" +
                        " in the face. The force of the water throws you into a sewer grate knocking you unconscious." +
                        " You awake a couple of hours later, face-up on a beach even further away from home" +
                        " than when you first started. GAME OVER",
                "Restart",
                "null",
                "null");
        //TODO image
        restart();
    }

    private void againstFlow(){
        storyHelper.canvasHelper("You start walking towards the source of the water, wherever that may be. " +
                "You hear a gush of water flowing ahead of you and quickly duck into a doorway before it rushes " +
                "past you. That was a close one. Do you want to try the door or keep going?",
                "Try the Door",
                "Keep Going",
                "null");
        //TODO image
        storyHelper.firstChoice.onClick(this::tryDoor);
        storyHelper.secondChoice.onClick(this::keepGoing);
    }

    public void keepGoing(){
        storyHelper.canvasHelper("You step out of the doorway and keep heading towards the source of the" +
                        " water. Your flashlight begins to flicker and you briefly can't see your surroundings." +
                        " You tumble down a hole, bumping your head on the way down. You awake surrounded by rats," +
                        " who appear to be worshiping you. You live out the rest of your days as a rat monarch. GAME OVER",
                "Restart",
                "null",
                "leftTunnelPhotos/rats.png");
        //TODO image
        restart();
    }

    private void tryDoor(){
        storyHelper.canvasHelper("You try the door and it swings open. That's weird. It appears to be a " +
                "control room of sorts. There's another door up ahead of you. Next to the door are two buttons. " +
                "It looks like one will open the door and one will sound an alarm. You just don't know " +
                "which one does which. Top button or bottom button?",
                "Top Button",
                "Bottom Button",
                "null");
        //TODO image
        storyHelper.firstChoice.onClick(this::topButton);
        storyHelper.secondChoice.onClick(this::bottomButton);
    }

    public void topButton(){
        storyHelper.canvasHelper("You press the top button and wait for the door to slide open. " +
                        "Instead, you are deafened by the screeching alarm. Within seconds, guards swarm into the " +
                        "room and apprehend you. They take you to a holding cell. Who knows when you'll get " +
                        "home now. GAME OVER",
                "Restart",
                "null",
                "null");
        //TODO image
        restart();
    }

    private void bottomButton(){
        storyHelper.canvasHelper("You press the bottom button and brace yourself for the alarm. " +
                "Instead, you are greeted with the comforting wooshing of the automatic door sliding open. " +
                "But inside is just a closet. In the closet, you see a pen and a mop." +
                " Which do you think will help you more?",
                "Pen",
                "Mop",
                "null");
        //TODO image
        storyHelper.firstChoice.onClick(this::pen);
        storyHelper.secondChoice.onClick(this::mop);
    }

    private void pen(){
        storyHelper.canvasHelper("The pen huh? Interesting choice. You pick it up. It looks normal enough. " +
                "You can't stop yourself from giving it a couple of clicks. After the third click, you see the " +
                "closet wall swing open. What kind of sewer is this? You head into the newly opened room and see " +
                "a guard asleep in front of the stairs. Do you want to knock the guard out or sneak past them?",
                "Knock Them Out",
                "Sneak Past Them",
                "null");
        //TODO image
        storyHelper.firstChoice.onClick(this::knockOut);
        storyHelper.secondChoice.onClick(this::sneak);
    }

    public void mop(){
        storyHelper.canvasHelper("You pick up the mop only to find that it is attached to the closet door. " +
                        "The floor underneath you collapses dropping you onto a bed of spikes. GAME OVER",
                "Restart",
                "null",
                "null");
        //TODO image
        restart();
    }

    public void knockOut(){
        storyHelper.canvasHelper("You grab a wrench off the floor and walk over to the guard, hoping to " +
                        "knock them out. You stand over the sleeping guard and hold the wrench over your head. " +
                        "You shut your eyes and swing down. You feel a strong hand catch your arm before you " +
                        "make contact. You know what happens next. GAME OVER",
                "Restart",
                "null",
                "null");
        //TODO image
        restart();
    }

    private void sneak() {
        storyHelper.canvasHelper("The guard looks like they are fast asleep, you could probably sneak " +
                "past them and up the stairs fairly easily. You reach the top of the stairs before you hear the " +
                "guard stir. You hear footsteps on the stairs below you, you have to hurry! You open the door at " +
                "the top of the stairs and emerge onto the sidewalk. This is close to your house! " +
                "You have escaped. YOU WIN",
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
