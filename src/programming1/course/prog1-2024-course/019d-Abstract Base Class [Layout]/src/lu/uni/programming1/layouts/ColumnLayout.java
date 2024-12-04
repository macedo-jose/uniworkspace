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
			System.out.print(components[i] + " ");
			++i;
			if (i % nrOfColumns == 0)
				System.out.println();
		}
		System.out.println();
	}

}
