import java.util.*;
import java.io.*;
public class Main{
public static void main(String[]args){
  Scanner x = new Scanner(System.in);
Puzzle game = new Puzzle();

  while(7==7){
    System.out.println("Please enter your guess");
    game.newGame();
    String me = x.next();
    game.Guess(me);
    while(!me.equals(game.getWord())){
      me = x.next();
      game.Guess(me);
    }
    System.out.println("Congrats! You guessed the word!");
    System.out.println("Would you like to play again? Y or N");
    if(!x.next().toLowerCase().equals("y")){
      break;
    }
    
    
  }
  
}
}
