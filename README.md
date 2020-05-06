# 127-final-project - Cave Escape

A choose your own adventure game.
Created by Alexander Hopkins and Amrit Johal.

## Instructions

Follow the story on the screen and choose which path you want to take. Be warned, 
the cave you are in is very dangerous, and death could be lurking around any corner.

If you die, usually the easiest solultion is to go back and 
choose the opposite option but if you're really stuck in the 
All Endings Framework folder are pictures with the correct path to take.

## Challenges and Solutions

Some of the challenges we faced were getting the text in GraphicsText objects to wrap, 
ensuring we could read the text on any background we chose and minimizing the repetition.

GraphicsText object do not respond to the typical "/n" new line convention. So in order to get
all the text displayed, and to make it look like it was being wrapped, we created a short function
that breaks the story over multiple GraphicsText objects position one on top of another. 

To ensure we could read the text on any of our chosen backgrounds we added a grey rectangle that 
the text can be displayed on. This came with it's own issues, such as getting the right length for 
the rectangle. This was solved by setting the height of the rectangle based by the number of 
GraphicsText objects. 

The third challange was minimizing repetition. We were worried that our 
choose your own adventure game was going to be an incomprehensible series of if-statements.
To solve this anticipated problem we instead have methods for each story, which are linked by 
buttons. This removes much of the clutter that we had anticipated.

## Extra Implementations

Given a little more time and expertise, one of the things we would have liked to implement is 
making the canvas more interactive. Instead of buttons we would have liked users to click on 
different canvas elements, such as the flashlight, to advance the story.

