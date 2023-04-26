package ie.tudublin;

import java.util.ArrayList;
import java.util.List;
import processing.core.PApplet;

public class DANI extends PApplet {

    private Model model;
    private String[] sonnet;

    public void settings() {
        size(1000, 1000);
        //fullScreen(SPAN);
    }

    public void setup() {
        colorMode(HSB);
    }

    public void keyPressed() {
        if (key == ' ') {
            sonnet = writeSonnet();
            for (String line : sonnet) {
                System.out.println(line);
            }
        }
    }

    private String[] writeSonnet() {
        String[] sonnet = new String[14];
        for (int i = 0; i < sonnet.length; i++) {
            String sentence = "";
            String word = getRandomWord();
            for (int j = 0; j < 8; j++) {
                sentence += word + " ";
                List<String> nextWords = model.getNextWords(word);
                if (nextWords.isEmpty()) {
                    break;
                }
                word = getRandomNextWord(nextWords);
            }
            sonnet[i] = sentence;
        }
        return sonnet;
    }

    private String getRandomWord() {
        return model.getWord(random(model.getWordCount()));
    }

    private String getRandomNextWord(List<String> nextWords) {
        return nextWords.get((int) random(nextWords.size()));
    }

    public void draw() {
        background(0);
        fill(255);
        noStroke();
        textSize(20);
        textAlign(CENTER, CENTER);
    }

    public void loadFile(String filename) {
        // Load text file into a String array
        String[] lines = loadStrings(filename);

        // Iterate over each line
        for (String line : lines) {
            // Split line into array of words
            String[] words = line.split(" ");

            // Iterate over each word
            for (String word : words) {
                // Remove punctuation characters and convert to lowercase
                String s = word.replaceAll("[^\\w\\s]","").toLowerCase();
            }
        }

        // Load the file into a DANI object

		model = new Model();
        DANI dani = new DANI();

		private class Model {
			// Define methods getNextWords() and getWordCount() here
		}
    }
}


class Word {
    private String word;
    private ArrayList<follow> fields;

    public Word(String word, ArrayList<follow> fields) {
        this.word = word;
        this.fields = fields;
    }

    public String getWord() {
        return word;
    }

    public ArrayList<follow> getFields() {
        return fields;
    }

    public String toString() {
        String result = word + "\n";
        for (follow follow : fields) {
            result += "\t" + follow + "\n";
        }
        return result;
    }

    public follow findFollow(String str) {
        for (follow f : fields) {
            if (f.getWord().equals(str)) {
                return f;
            }
        }
        return null;
    }

    public void printModel() {
        for (Word word : words) {
            System.out.println(word);
        }
    }
}






