package lu.uni.programming1;

import lu.uni.programming1.layouts.*;

public class Launcher {

	public static void main(String[] args) {
		HorizontalFlowLayout l = new HorizontalFlowLayout(5);
		// VerticalFlowLayout l = new VerticalFlowLayout(5);
		// ColumnLayout l = new ColumnLayout(5, 3);
		
		l.addComponent(new Component("red"));
		l.addComponent(new Component("green"));
		l.addComponent(new Component("blue"));
		// l.addComponent(null);
		l.addComponent(new Component("yellow"));
		l.addComponent(new Component("pink"));
		// l.addComponent(new Component("this will overflow"));
		// l.components[222] = null;
		l.show();
	}

}
