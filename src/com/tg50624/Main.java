package com.tg50624;
import javax.swing.*;

public class Main {

    public static void main(String[] args){
	    JFrame frame = new JFrame("Block breaking game");

		BlockPanel panel = new BlockPanel();
		frame.getContentPane().add(panel);

	    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	    frame.setResizable(false);
	    frame.setSize(900,900);
	    frame.setLayout(null);
    }
}
