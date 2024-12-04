package lu.uni.programming1;

import lu.uni.programming1.layouts.*;

public class Launcher {

	public static void main(String[] args) {
		Layout l = new ColumnLayout(5, 3);
		// Layout l = new HorizontalFlowLayout(5);
		// Layout l = new Layout(5);
		
		l.addComponent(new Component("red"));
		l.addComponent(new Component("green"));
		l.addComponent(new Component("blue"));
		l.addComponent(new Component("yellow"));
		l.addComponent(new Component("pink"));
		
		l.show();
		
		// Frame f = new Frame("My Frame", l);
		// f.display();
	}

}
