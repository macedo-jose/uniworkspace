package lu.uni.programming1.layouts;

import lu.uni.programming1.Container;

public class HorizontalFlowLayout extends Layout {

	public HorizontalFlowLayout(Container container) {
		super(container);
	}
	
	@Override
	public void show() {
		for (int i=0 ; i<container.getNrOfComponents() ; ++i) {
			container.getComponent(i).print();
			if (i != container.getNrOfComponents() - 1)
				System.out.print(" | ");
		}
		System.out.println();
	}

}
