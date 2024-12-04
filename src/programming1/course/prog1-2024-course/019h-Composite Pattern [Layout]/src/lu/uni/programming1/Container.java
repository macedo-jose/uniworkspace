package lu.uni.programming1;

import lu.uni.programming1.components.Component;
import lu.uni.programming1.layouts.Layout;

public class Container extends Component {

	private Component components[];
	private int nextComponent;
	private Layout layout;

	public Container(String name, int nrOfComponents, Layout layout) {
		super(name);
		components = new Component[nrOfComponents];
		nextComponent = 0;
		this.layout = layout;
	}
	
	public void addComponent(Component c) {
		if (c == null) {
			System.err.println("cannot add 'null' component ...");
			return;
		}
		if (nextComponent < components.length)
			components[nextComponent++] = c;
		else
			System.err.println("maximum number of components (" + components.length + ") exceeded ...");
	}
	
	public int getNrOfComponents() {
		return components.length;
	}
	
	public Component getComponent(int i) {
		return components[i];
	}

	@Override
	public void print() {
		layout.show(this);
	}

}
