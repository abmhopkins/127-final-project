import comp127graphics.*;
import comp127graphics.Image;
import comp127graphics.Rectangle;
import comp127graphics.ui.Button;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Functions that assist in the running and positioning of the game elements, the text, the canvas background
 * and buttons.
 * <p>
 * Authors: Amrit Johal and Alexander Hopkins
 * Original Work
 */
public class StoryHelper {

    private final int CANVAS_WIDTH;
    private final int CANVAS_HEIGHT;
    private final int LENGTH_WORDS = 15;
    private final int TEXTBOX_WIDTH = 660;

    private CanvasWindow canvas;
    private Rectangle rectangle;
    public Button firstChoice;
    public Button secondChoice;

    public StoryHelper(CanvasWindow canvas){
        this.canvas = canvas;
        this.CANVAS_WIDTH = canvas.getWidth();
        this.CANVAS_HEIGHT = canvas.getHeight();
    }

    /**
     * The canvas helper controls all the elements on the canvas and arranges them on the canvas.
     *
     * @param storyText the text of the story you want displayed
     * @param choice1   the first choice you want displayed on the button
     * @param choice2   the second choice you want displayed on the button
     * @param imageName the path of the image you want displayed as the background
     */
    public void canvasHelper(String storyText, String choice1, String choice2, String imageName){
        canvas.removeAll();
        if(!imageName.equals("null")) {
            Image image = new Image(0, 0);
            image.setImagePath(imageName);
            canvas.add(image);
        }

        rectangle = new Rectangle(0,0,TEXTBOX_WIDTH,110);
        rectangle.setCenter(CANVAS_WIDTH*0.5, CANVAS_HEIGHT*0.33);
        rectangle.setFillColor(Color.LIGHT_GRAY);
        rectangle.setStrokeColor(Color.LIGHT_GRAY);
        rectangle.setFilled(true);
        canvas.add(rectangle);


        wrapText(storyText);

        if(!choice1.equals("null")) {
            firstChoice = new Button(choice1);
            firstChoice.setCenter(CANVAS_WIDTH * 0.5, CANVAS_HEIGHT * 0.6);
            canvas.add(firstChoice);
        }

        if(!choice2.equals("null")) {
            secondChoice = new Button(choice2);
            secondChoice.setCenter(CANVAS_WIDTH * 0.5, CANVAS_HEIGHT * 0.7);
            canvas.add(secondChoice);
        }
    }


    /**
     * Creates a series of GraphicsText objects that are a specified number of words long.
     * First splits the text and converts the resulting array to a list, then loops through
     * the list adding labels to the canvas as necessary giving the impression of wrapping text
     *
     * Updates the height of the text box
     *
     * @param text the text of the story you want displayed
     */
    public void wrapText(String text){
        List<String> words = new ArrayList<>(Arrays.asList(text.split("\\s+"))); //separates the text into a list, keeps punctuation
        int length = words.size();
        if(length > LENGTH_WORDS){
            int rows = (length/LENGTH_WORDS) + 1;   //Calculates the number of rows of text required
            rectangle.setSize(TEXTBOX_WIDTH, 25*rows); //Changes the height of the text rectangle depending on the rows of text
            for (int i = 0; i < rows; i++) {
                double y = CANVAS_HEIGHT * (0.25 + i * 0.05);
                String story = "";
                for (int j = i * LENGTH_WORDS; j < (LENGTH_WORDS) + i*LENGTH_WORDS; j++) {
                    if(j < length) {
                        story = story.concat(words.get(j) + " ");
                    }
                }
                GraphicsText label = new GraphicsText(story);
                label.setCenter(CANVAS_WIDTH * 0.48, y);
                label.setFont(FontStyle.BOLD, 14);
                label.setFillColor(Color.RED);
                canvas.add(label);
            }
        } else{
            GraphicsText label = new GraphicsText(text);
            label.setCenter(CANVAS_WIDTH*0.5, CANVAS_HEIGHT*0.33);
            canvas.add(label);
        }
    }
}
