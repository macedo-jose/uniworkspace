package lu.uni.programming1.layouts;

import lu.uni.programming1.Container;

public class ColumnLayout extends Layout {

	private int nrOfColumns;

	public ColumnLayout(Container container, int nrOfColumns) {
		super(container);
		this.nrOfColumns = nrOfColumns;
	}
	
	@Override
	public void show() {
		int i = 0;
		
		while (i < container.getNrOfComponents()) {
			container.getComponent(i).print();
			++i;
			if (i % nrOfColumns == 0)
				System.out.println();
			else
				System.out.print(" | ");
		}
		System.out.println();
	}

}
