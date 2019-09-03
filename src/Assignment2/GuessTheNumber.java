import java.util.Random;
import java.util.Scanner;

class GuessTheNumber{
	private
		int random, guess;

	static Scanner keyboard = new Scanner(System.in);
	public int getRandom() {
		return random;
	}
	public void setRandom(int random) {
		this.random = random;
	}
	public int getGuess() {
		return guess;
	}
	public void setGuess(int guess) {
		this.guess = guess;
	}
	private void Play(){
        Random generator = new Random();
        setRandom(generator.nextInt(1000)) ;
        
        System.out.print("I am thinking of a number between 0 and 1000, what do you think it is?");

        setGuess(keyboard.nextInt()); 
        while (guess != random) {
            if (guess < random) {
                System.out.print("Too Low! Guess Again-");
            }
            else {
                System.out.print("Too High! Guess Again-");
            } 
            setGuess(keyboard.nextInt()); 
        }

        System.out.print("Zero in! Congrats! "+getRandom() + " is the correct answer." );

	}
	
	public static void main(String args[]) {
		GuessTheNumber play = new GuessTheNumber();
		char choice;
		do{
			play.Play();
		
			System.out.print("Do you want to play again(y/n):" );
			choice = keyboard.next().charAt(0);
			
		}while(choice=='y' || choice == 'Y');
		keyboard.close();
    }
}