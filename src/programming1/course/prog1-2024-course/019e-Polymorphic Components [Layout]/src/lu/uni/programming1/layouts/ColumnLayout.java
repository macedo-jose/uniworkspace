package lu.uni.programming1.layouts;

public class ColumnLayout extends Layout {

	private int nrOfColumns;

	public ColumnLayout(int nrOfComponents, int nrOfColumns) {
		super(nrOfComponents);
		this.nrOfColumns = nrOfColumns;
	}
	
	@Override
	public void show() {
		int i = 0;
		
		while (i < components.length) {
			components[i].print();
			++i;
			if (i % nrOfColumns == 0)
				System.out.println();
			else
				System.out.print(" | ");
		}
		if (i % nrOfColumns != 0)
			System.out.println();
	}

}
