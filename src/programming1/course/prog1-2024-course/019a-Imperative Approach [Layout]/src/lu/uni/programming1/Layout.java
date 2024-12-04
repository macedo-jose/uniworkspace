package lu.uni.programming1;

public class Layout {

	Component components[];
	int nextComponent;
	int nrOfColumns;
	int layoutType;

	public static final int LAYOUT_HORIZONTAL_FLOW = 1;
	public static final int LAYOUT_VERTICAL_FLOW = 2;
	public static final int LAYOUT_COLUMNS = 3;

	public Layout(int nrOfComponents, int layoutType) {
		components = new Component[nrOfComponents];
		nextComponent = 0;
		this.layoutType = layoutType;
	}

	public Layout(int nrOfComponents, int layoutType, int nrOfColumns) {
		this(nrOfComponents, layoutType);
		this.nrOfColumns = nrOfColumns;
	}

	public void addComponent(Component c) {
		if (nextComponent < components.length)
			components[nextComponent++] = c;
		else
			System.err.println("maximum number of components (" + components.length + ") exceeded ...");
	}

	public void show() {
		switch (layoutType) {
		case LAYOUT_HORIZONTAL_FLOW:
			showHorizontalFlow();
			break;
		case LAYOUT_VERTICAL_FLOW:
			showVerticalFlow();
			break;
		case LAYOUT_COLUMNS:
			showColumns();
			break;
		default:
			System.err.println("should never happen :-(");
		}
	}
	
	private void showHorizontalFlow() {
		for (int i=0 ; i<components.length ; ++i)
			System.out.print(components[i] + " ");
		System.out.println();
	}
	
	private void showVerticalFlow() {
		for (int i=0 ; i<components.length ; ++i)
			System.out.println(components[i]);
	}

	private void showColumns() {
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
