package edu.sysvp.console;

import java.util.Date;
import edu.sysvp.program.ClubHelper;
import com.sandklef.edu.ConsoleMenu.*;
import edu.sysvp.program.MemberTeamComparator;

public class Menu {
    
    ClubHelper ch ;
    
    public Menu(ClubHelper c) {
	ch = c;
    }

    

    public void run() {

    Date dat = new Date();

	System.out.println("Välkommen!" + "Dagens Datum: " + dat.toString());	

   	ConsoleMenu menu = new ConsoleMenu("-----===< Club Manager >===-----");
	menu.addMenuItem(new MenuItem(){
		public void menuItemSelected(ConsoleMenuEvent e) { 
		    ch.printMembersAlpha(); } 
	    },"Lista medlemmerna på efternamn" );

	menu.addMenuItem(new MenuItem(){
		public void menuItemSelected(ConsoleMenuEvent e) { 
		    ch.printMembersAlphaFirstName(); } 
	    },"Lista medlemmarna på förnamnet" );

	menu.addMenuItem(new MenuItem(){
		public void menuItemSelected(ConsoleMenuEvent e){
			ch.printMembers();}
		},"Lista efter id");	

	menu.addMenuItem(new MenuItem(){
		public void menuItemSelected(ConsoleMenuEvent e){
			ch.printTeamMembers();}					

		},"Lista efter lagtillhörighet");

	//* här efter kommer kod som inte kommer att användas*//


	menu.addMenuItem(new MenuItem(){
		public void menuItemSelected(ConsoleMenuEvent e) { 
		    String input = ch.askUser("Enter search string, you bastard: ");
		    String search = "%" + input.trim() + "%";
		    ch.printMembers(search); 
		}
	    },"Search for member" );

	menu.addMenuItem(new MenuItem(){
		public void menuItemSelected(ConsoleMenuEvent e) { 
		    String input = ch.askUser("Enter search string, Bob Dylan: ");
		    String search = "%" + input.trim() + "%";
		    ch.printMembers(search); 
		}
	    },"One more coffee" );

	menu.run();
    }

}
