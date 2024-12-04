package lu.uni.programming1;

import lu.uni.programming1.layouts.*;

public class Launcher {

	public static void main(String[] args) {
		VerticalFlowLayout l = new VerticalFlowLayout(5);
		
		l.addComponent(new Component("red"));
		l.addComponent(new Component("green"));
		l.addComponent(new Component("blue"));
		l.addComponent(new Component("yellow"));
		l.addComponent(new Component("pink"));
		l.show();
		
		// l.components[0] = null;
		
		// Frame f = new Frame("My Frame", l);
		
		// f.display();
	}

}
