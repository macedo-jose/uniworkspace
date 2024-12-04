package lu.uni.programming1.layouts;

import lu.uni.programming1.Container;

public class VerticalFlowLayout extends Layout {

	public VerticalFlowLayout(Container container) {
		super(container);
	}
	
	@Override
	public void show() {
		for (int i=0 ; i<container.getNrOfComponents() ; ++i) {
			container.getComponent(i).print();
			System.out.println();
		}
	}

}
