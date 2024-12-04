package lu.uni.programming1;

import lu.uni.programming1.components.*;
import lu.uni.programming1.layouts.*;

public class Launcher {

	public static void main(String[] args) {
		Container warriors = new Container("warriors", 4, new ColumnLayout(2));
		
		warriors.addComponent(new Creature("Shadow Rider", 2, 42.0));
		warriors.addComponent(new Creature("Cu Sith", 4, 28.8));
		warriors.addComponent(new Creature("Bone Dragon", 4, 63.5));
		warriors.addComponent(new Creature("Cyber Saber", 3, 33.3));
		
		Container world = new Container("world", 3, new VerticalFlowLayout());
		
		world.addComponent(new Building("Whoops Zilla", 4));
		world.addComponent(warriors);
		world.addComponent(new Vehicle("Midnight Runner", 6));
		
		Frame f = new Frame("Grand Hall", world);
		
		f.display();
	}

}
