package main.ui;

import main.interfaces.HeaderInterface;

public class Header implements HeaderInterface{

	@Override
	public void showHeader() {
		// TODO Auto-generated method stub
		System.out.println("*******************************\r\n"
				+ "\r\n"
				+ "Welcome to Staff Management App\r\n"
				+ "\r\n"
				+ "*******************************");
	}
	
}
