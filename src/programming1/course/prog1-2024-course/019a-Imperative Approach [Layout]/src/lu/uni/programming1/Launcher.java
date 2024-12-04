package lu.uni.programming1;

public class Launcher {

	public static void main(String[] args) {
		Layout l = new Layout(5, Layout.LAYOUT_HORIZONTAL_FLOW);
		
		l.addComponent(new Component("red"));
		l.addComponent(new Component("green"));
		l.addComponent(new Component("blue"));
		l.addComponent(new Component("yellow"));
		l.addComponent(new Component("pink"));
		// l.addComponent(new Component("ooops"));
		// l.addComponent(null);
		// l.components[0] = null;
		l.show();
		
	}

}
