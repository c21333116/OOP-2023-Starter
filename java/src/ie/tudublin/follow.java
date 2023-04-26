package ie.tudublin;
import java.util.ArrayList;

public class follow{
    private String word;
    private int count;


    public void follow(String word, int count){
        this.word = word;
        this.count = count;
    }

    public String getWord(){
        return word;
    }

    public int getCount(){
        return count;
    }

    public String toString(){
        return word + " " + count;
    }
}


class Word{
    private String word;
    private ArrayList<follow> fields = new ArrayList<follow>();

    public String getWord(){
        return word;
    }

    public ArrayList<follow> getFields(){
        return fields;
    }

    public String toString() {
        StringBuilder ss = new StringBuilder();
        ss.append(word).append("\n");
        for (follow fields : fields) {
            ss.append("\t").append(fields).append("\n");
        }
        return ss.toString();
    }

    // write a method called findFollow(str) on the Word class You can make these methods return null if there is no match.
    public follow findFollow(String str){
        for(follow f : fields){
            if(f.getWord().equals(str)){
                return f;
            }
        }
        return null;
    }

    public void printModel(){
        
        

    }
}







