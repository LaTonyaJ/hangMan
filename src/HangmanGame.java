import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class HangmanGame {
    
    private ArrayList<Character> correctLetters = new ArrayList<Character>();
    private ArrayList<String> guessedLetters = new ArrayList<String>();
    private int remaining;
    private String wordToGuess;

    //Select random word 
    private String luckyString(){
        ArrayList<String> words = new ArrayList<String>();
        words.add("aardvark");
        words.add("banquet");
        words.add("circle");
        words.add("dinosaur");
        Random rand = new Random();
        int idx = rand.nextInt(words.size()); 
        wordToGuess = words.get(idx); 
        return wordToGuess;
    }

    public String getWord(){
        String word = this.luckyString();
        //Add selected word to correct letter array
        for(int i = 0; i < word.length(); i++){
            correctLetters.add(word.charAt(i));
        }
        System.out.println("correctLetters: " + correctLetters);
        return word;
    }

    public HangmanGame(){
        System.out.println("*************************************************");
        System.out.println("Let's Play Hangman...");
        System.out.println("You get 6 chances to guess what word I'm thinking of or you hang your man.");
        System.out.println("Scary times for the man huh??");
        System.out.println("Good Luck.");

        getWord();
    }

    public void gameOn(){
        
        //Number of lives
        remaining = 6;
        //for(int i = remaining; i > 0; i--){
            //Word length
            for(int j = 0; j < wordToGuess.length(); j++){
                System.out.print(" _ ");
            }
            System.out.println(" ");

                try {
                    makeAGuess();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            
        //}
    }

    private void makeAGuess() throws IOException{
        try {

            System.out.print("Guess a letter: ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Character guess = reader.readLine();
            if(correctLetters.contains(guess)){
                //add letter to guessed and replace _ with letter
            }else{
                //add to guessed and hang the man
            } 
            
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println(e);
        }
        

    }



}
