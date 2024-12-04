package lu.uni.programming1.layouts;

import lu.uni.programming1.Component;

public class Layout {

	Component components[];
	int nextComponent;

	public Layout(int nrOfComponents) {
		components = new Component[nrOfComponents];
		nextComponent = 0;
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

}
