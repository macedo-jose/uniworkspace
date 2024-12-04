package lu.uni.programming1;

import lu.uni.programming1.components.*;
import lu.uni.programming1.layouts.*;

public class Launcher {

	public static void main(String[] args) {
		Container warriors = new Container(4);
		
		warriors.addComponent(new Creature("Shadow Rider", 2, 42.0));
		warriors.addComponent(new Creature("Cu Sith", 4, 28.8));
		warriors.addComponent(new Creature("Bone Dragon", 4, 63.5));
		warriors.addComponent(new Creature("Cyber Saber", 3, 33.3));
		
		ColumnLayout warriorLayout = new ColumnLayout(warriors, 2);
		
		Container c = new Container(3);
		
		c.addComponent(new Building("Whoops Zilla", 4));
		c.addComponent(warriorLayout);
		c.addComponent(new Vehicle("Midnight Runner", 6));
		
		VerticalFlowLayout vfl = new VerticalFlowLayout(c);
		Frame f = new Frame("Grand Hall", vfl);
		
		f.display();
	}

}
