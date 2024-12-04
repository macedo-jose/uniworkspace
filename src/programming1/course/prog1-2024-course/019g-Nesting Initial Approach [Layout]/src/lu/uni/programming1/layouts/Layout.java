package lu.uni.programming1.layouts;

import lu.uni.programming1.Container;
import lu.uni.programming1.components.Component;

public abstract class Layout extends Component {

	protected Container container;

	public Layout(Container container) {
		super("Layout component");
		this.container = container;
	}

	public abstract void show();
	
	@Override
	public void print() {
		show();
	}
	
}
