package lu.uni.programming1.layouts;

import lu.uni.programming1.Container;

public class VerticalFlowLayout extends Layout {
	
	@Override
	public void show(Container container) {
		for (int i=0 ; i<container.getNrOfComponents() ; ++i) {
			container.getComponent(i).print();
			System.out.println();
		}
	}

}
