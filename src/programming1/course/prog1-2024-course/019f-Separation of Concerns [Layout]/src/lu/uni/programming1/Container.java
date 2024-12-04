package lu.uni.programming1;

import lu.uni.programming1.components.Component;

public class Container {

	private Component components[];
	private int nextComponent;

	public Container(int nrOfComponents) {
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
	
	public int getNrOfComponents() {
		return components.length;
	}
	
	public Component getComponent(int i) {
		return components[i];
	}

}
