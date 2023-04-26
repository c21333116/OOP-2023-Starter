import java.util.ArrayList;

public class Follow {
    private String word;
    private int count;

    public Follow(String word, int count) {
        this.word = word;
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public int getCount() {
        return count;
    }

    public String toString() {
        return word + " " + count;
    }
}



class Word {
    private String word;
    private ArrayList<Follow> follows;

    public Word(String word, ArrayList<Follow> follows) {
        this.word = word;
        this.follows = follows;
    }

    public String getWord() {
        return word;
    }

    public ArrayList<Follow> getFollows() {
        return follows;
    }

    public String toString() {
        String result = word + "\n";
        for (Follow follow : follows) {
            result += "\t" + follow + "\n";
        }
        return result;
    }

    public Follow findFollow(String str) {
        for (Follow f : follows) {
            if (f.getWord().equals(str)) {
                return f;
            }
        }
        return null;
    }
}








