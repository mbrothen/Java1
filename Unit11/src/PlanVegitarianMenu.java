import javax.swing.*;
public class PlanVegitarianMenu {

	public static void main(String[] args) {
		VegetarianMenu briefMenu = new VegetarianMenu();
		PickMenu entree = null;
		String guestChoice = new String();
		try {
			PickMenu selection = new PickMenu(briefMenu);
			entree = selection;
			guestChoice = entree.getGuestChoice();
		}
		catch(Exception error) {
			guestChoice = "an invalid vegetarian selection";
		}
		JOptionPane.showMessageDialog(null,  "You chose " + guestChoice);
		
	}

}
