package lu.uni.programming1;

import lu.uni.programming1.components.*;
import lu.uni.programming1.layouts.*;

public class Launcher {

	public static void main(String[] args) {
		Container c = new Container(4);
		
		c.addComponent(new Creature("Shadow Rider", 2, 42.0));
		c.addComponent(new Building("Whoops Zilla", 4));
		c.addComponent(new Vehicle("Midnight Runner", 6));
		c.addComponent(new Creature("Cu Sith", 4, 28.8));
		
		ColumnLayout cl = new ColumnLayout(c, 2);
		Frame f1 = new Frame("Grand Hall", cl);
		f1.display();
		
		VerticalFlowLayout vfl = new VerticalFlowLayout(c);
		Frame f2 = new Frame("Small Tunnel", vfl);
		f2.display();
	}

}
