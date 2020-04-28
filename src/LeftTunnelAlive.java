import comp127graphics.CanvasWindow;

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
                "Up the Ladder" );
        storyHelper.firstChoice.onClick(this::bridge);
        storyHelper.secondChoice.onClick(this::ladder);
    }

    private void bridge(){
        storyHelper.canvasHelper("You cross the rickety old rope bridge carefully and make it to the other side. " +
                        "Now on the other side, you see that the cave splits again. " +
                        "You can either take the left tunnel or the right tunnel.",
                "Left Tunnel",
                "Right Tunnel");
//        firstChoice.onClick();
//        secondChoice.onClick();
    }

    private void ladder(){
        storyHelper.canvasHelper("You climb the ladder and find yourself on the edge of a sewer pipe." +
                        "This is a good start, you must be close to the surface! The sewer water is flowing from " +
                        "left to right, do you want to go with the flow or against the flow?" ,
                "With the Flow",
                "Against the Flow");
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
                "null");
        restart();
    }

    private void againstFlow(){
        storyHelper.canvasHelper("You start walking towards the source of the water, wherever that may be. " +
                "You hear a gush of water flowing ahead of you and quickly duck into a doorway before it rushes " +
                "past you. That was a close one. Do you want to try the door or keep going?",
                "Try the Door",
                "Keep Going");
        storyHelper.firstChoice.onClick(this::tryDoor);
        storyHelper.secondChoice.onClick(this::keepGoing);
    }

    public void keepGoing(){
        storyHelper.canvasHelper("You step out of the doorway and keep heading towards the source of the" +
                        " water. Your flashlight begins to flicker and you briefly can't see your surroundings." +
                        " You tumble down a hole, bumping your head on the way down. You awake surrounded by rats," +
                        " who appear to be worshiping you. You live out the rest of your days as a rat monarch. GAME OVER",
                "Restart",
                "null");
        restart();
    }

    private void tryDoor(){
        storyHelper.canvasHelper("You try the door and it swings open. That's weird. It appears to be a " +
                "control room of sorts. There's another door up ahead of you. Next to the door are two buttons. " +
                "It looks like one will open the door and one will sound an alarm. You just don't know " +
                "which one does which. Top button or bottom button?",
                "Top Button",
                "Bottom Button");
        storyHelper.firstChoice.onClick(this::topButton);
        storyHelper.secondChoice.onClick(this::bottomButton);
    }

    public void topButton(){
        storyHelper.canvasHelper("You press the top button and wait for the door to slide open. " +
                        "Instead, you are deafened by the screeching alarm. Within seconds, guards swarm into the " +
                        "room and apprehend you. They take you to a holding cell. Who knows when you'll get " +
                        "home now. GAME OVER",
                "Restart",
                "null");
        restart();
    }

    private void bottomButton(){
        storyHelper.canvasHelper("You press the bottom button and brace yourself for the alarm. " +
                "Instead, you are greeted with the comforting wooshing of the automatic door sliding open. " +
                "But inside is just a closet. In the closet, you see a pen and a mop." +
                " Which do you think will help you more?",
                "Pen",
                "Mop");
        storyHelper.firstChoice.onClick(this::pen);
        storyHelper.secondChoice.onClick(this::mop);
    }

    private void pen(){
        storyHelper.canvasHelper("The pen huh? Interesting choice. You pick it up. It looks normal enough. " +
                "You can't stop yourself from giving it a couple of clicks. After the third click, you see the " +
                "closet wall swing open. What kind of sewer is this? You head into the newly opened room and see " +
                "a guard asleep in front of the stairs. Do you want to knock the guard out or sneak past them?",
                "Knock Them Out",
                "Sneak Past Them");
        storyHelper.firstChoice.onClick(this::knockOut);
        storyHelper.secondChoice.onClick(this::sneak);
    }

    public void mop(){
        storyHelper.canvasHelper("You pick up the mop only to find that it is attached to the closet door. " +
                        "The floor underneath you collapses dropping you onto a bed of spikes. GAME OVER",
                "Restart",
                "null");
        restart();
    }

    public void knockOut(){
        storyHelper.canvasHelper("You grab a wrench off the floor and walk over to the guard, hoping to " +
                        "knock them out. You stand over the sleeping guard and hold the wrench over your head. " +
                        "You shut your eyes and swing down. You feel a strong hand catch your arm before you " +
                        "make contact. You know what happens next. GAME OVER",
                "Restart",
                "null");
        restart();
    }

    private void sneak() {
        storyHelper.canvasHelper("The guard looks like they are fast asleep, you could probably sneak " +
                "past them and up the stairs fairly easily. You reach the top of the stairs before you hear the " +
                "guard stir. You hear footsteps on the stairs below you, you have to hurry! You open the door at " +
                "the top of the stairs and emerge onto the sidewalk. This is close to your house! " +
                "You have escaped. YOU WIN",
                "Restart",
                "null");
        restart();
    }

    public void restart(){
        StartGame startGame = new StartGame(canvas);
        storyHelper.firstChoice.onClick(startGame::startGame);
    }

}
