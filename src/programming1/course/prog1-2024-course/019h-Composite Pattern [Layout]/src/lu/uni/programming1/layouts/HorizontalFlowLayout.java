package lu.uni.programming1.layouts;

import lu.uni.programming1.Container;

public class HorizontalFlowLayout extends Layout {
	
	@Override
	public void show(Container container) {
		for (int i=0 ; i<container.getNrOfComponents() ; ++i) {
			container.getComponent(i).print();
			if (i != container.getNrOfComponents() - 1)
				System.out.print(" | ");
		}
		System.out.println();
	}

}
