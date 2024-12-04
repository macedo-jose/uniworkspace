package lu.uni.programming1.layouts;

import lu.uni.programming1.Container;

public class ColumnLayout extends Layout {

	private int nrOfColumns;

	public ColumnLayout(int nrOfColumns) {
		this.nrOfColumns = nrOfColumns;
	}
	
	@Override
	public void show(Container container) {
		int i = 0;
		
		while (i < container.getNrOfComponents()) {
			container.getComponent(i).print();
			++i;
			if (i % nrOfColumns == 0) {
				if (i < container.getNrOfComponents() - 1)
					System.out.println();
			}
			else
				System.out.print(" | ");
		}
		if (i % nrOfColumns != 0)
			System.out.println();
	}

}
