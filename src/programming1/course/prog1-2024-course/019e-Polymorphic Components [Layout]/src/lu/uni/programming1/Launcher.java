package lu.uni.programming1;

import lu.uni.programming1.components.*;
import lu.uni.programming1.layouts.*;

public class Launcher {

	public static void main(String[] args) {
		Layout l = new VerticalFlowLayout(4);
		// Layout l = new ColumnLayout(4, 2);
		
		l.addComponent(new Creature("Shadow Rider", 2, 42.0));
		l.addComponent(new Building("Whoops Zilla", 4));
		l.addComponent(new Vehicle("Midnight Runner", 6));
		l.addComponent(new Creature("Cu Sith", 4, 28.8));
		
		l.show();
		
		// Frame f = new Frame("Grand Hall", l);
		// f.display();
	}

}
