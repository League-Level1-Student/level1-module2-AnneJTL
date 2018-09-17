import javax.swing.JOptionPane;


public class PopcornMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Your mission and you have to accept it:
		 * Create a PopcornMaker class and add a main method to it that creates a bag of Popcorn and cooks it in the microwave.
		 * Ask the user for the flavor of the popcorn and the number of minutes to cook it.
		 *  Don't change the existing methods.
		 */
		String flavor = JOptionPane.showInputDialog("What flavor do you want ?");
		Popcorn popcornBag = new Popcorn(flavor);
		
		String nbMinCook = JOptionPane.showInputDialog("How many minutes do you need to cook popcorn ?");
		int cookTime = Integer.parseInt(nbMinCook);
		
		Microwave oven = new Microwave();
		oven.setTime(cookTime);
		oven.putInMicrowave(popcornBag);
		oven.startMicrowave();
		
		popcornBag.eat();
	}

}
