/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

public class GuessGameLogic {
  private int theNumber;
  private int remainder = 5;
  private String hint;
  public GuessGameLogic() {}
   public GuessGameLogic(int startNumber, int endNumber) {
      initialize( startNumber,  endNumber);
   }
  public void initialize(int startNumber, int endNumber) {
    this.theNumber = generateRandomNumber(startNumber , endNumber);
  }
  public boolean isCorrectGuess(int guess) {
    if (guess == theNumber) {
      return true;
    } else { 
      if(guess > theNumber)
        hint="Guess Number to Big";       
      else
        hint="Guess Number to Small";       
      remainder--;
      return false;
    }
  }
  private int generateRandomNumber(int startNumber, int endNumber) {
    double range = (double) (endNumber - startNumber + 1);
    return startNumber + (int) (Math.random() * range);
  }
  public int getRemainder() {
    return remainder;
  }
  public String getHint()
  {
    return hint;
  }
}
