/** 
 * Assignment 1
 * Madison Roybal
 * CSE 360 T/Hybird
 * 214201429
 */

package cse360assignment02;

public class AddingMachine {
  private int total;
  private String history;
  
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = "0";
   
  }

  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  total = value + total;
	  history = history + " + " + value;
  }

  public void subtract (int value) {
	  total = total - value;
	  history = history + " - " + value;
  }

  public String toString () {
    return history;
  }

  public void clear() {
  }
  public static void main (String[] args){
	  // example of AddingMachine working:
	  AddingMachine myCalculator = new AddingMachine();
	  myCalculator.add(4);
	  myCalculator.subtract(2);
	  myCalculator.add(5);
	  System.out.println(myCalculator.toString());
  }
}
