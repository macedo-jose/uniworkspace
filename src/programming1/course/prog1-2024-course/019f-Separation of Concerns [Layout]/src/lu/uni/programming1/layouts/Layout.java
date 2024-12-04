package lu.uni.programming1.layouts;

import lu.uni.programming1.Container;

public abstract class Layout {

	protected Container container;

	public Layout(Container container) {
		this.container = container;
	}
	
	public abstract void show();
	
}
