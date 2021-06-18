package main;

import main.controller.Controller;
import main.ui.Header;
import main.ui.Menu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Header header = new Header();
		Menu menu = new Menu();
		
		Controller ctr = new Controller(header, menu);
		ctr.run();
		
	}

}
