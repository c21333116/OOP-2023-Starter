package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);

		
		
	}

	public void keyPressed() {

	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}

	public void loadFile(String filename) {
		// Load text file into a String array
		String[] lines = loadStrings("small.txt");
		
		// Iterate over each line
		for (String line : lines) {
			// Split line into array of words
			String[] words = split(line, ' ');
			
			// Iterate over each word
			for (String word : words) {
				// Remove punctuation characters and convert to lowercase
				String s = word.replaceAll("[^\\w\\s]","").toLowerCase();
				// Process the clean word
			}
		}
		
		// Load the file into a DANI object
		DANI dani = new DANI();
	
	}

	// write a method called findWord(str) that finds a word in the model so you can check if it already exists
	public boolean findWord(String str)
	{
		return false;
	}

}
