import comp127graphics.CanvasWindow;
import comp127graphics.GraphicsText;
import comp127graphics.ui.Button;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StoryHelper {

    private final int CANVAS_WIDTH;
    private final int CANVAS_HEIGHT;
    private final int LENGTH_WORDS = 20;

    private CanvasWindow canvas;
    public Button firstChoice;
    public Button secondChoice;

    public StoryHelper(CanvasWindow canvas){
        this.canvas = canvas;
        this.CANVAS_WIDTH = canvas.getWidth();
        this.CANVAS_HEIGHT = canvas.getHeight();
    }

    public void canvasHelper(String storyText, String choice1, String choice2){
        // TODO add capabilities that change the background - most likely as another parameter
        canvas.removeAll();

        wrapText(storyText);

        firstChoice = new Button(choice1);
        firstChoice.setCenter(CANVAS_WIDTH*0.5,CANVAS_HEIGHT*0.6);
        canvas.add(firstChoice);

        secondChoice = new Button(choice2);
        secondChoice.setCenter(CANVAS_WIDTH*0.5,CANVAS_HEIGHT*0.7);
        canvas.add(secondChoice);
    }

    public void wrapText(String text){
        List<String> words = new ArrayList<>(Arrays.asList(text.split("\\s+")));
        int length = words.size();
        if(length > LENGTH_WORDS){
            int rows = (length/LENGTH_WORDS) + 1;
            for (int i = 0; i < rows; i++) {
                double y = CANVAS_HEIGHT * (0.28 + i * 0.05);
                String story = "";
                for (int j = i * LENGTH_WORDS; j < (LENGTH_WORDS) + i*LENGTH_WORDS; j++) {
                    if(j < length) {
                        story = story.concat(words.get(j) + " ");
                    }
                }
                GraphicsText label = new GraphicsText(story);
                label.setCenter(CANVAS_WIDTH * 0.5, y);
                canvas.add(label);
            }
        } else{
            GraphicsText label = new GraphicsText(text);
            label.setCenter(CANVAS_WIDTH*0.5, CANVAS_HEIGHT*0.33);
            canvas.add(label);
        }
    }
}
