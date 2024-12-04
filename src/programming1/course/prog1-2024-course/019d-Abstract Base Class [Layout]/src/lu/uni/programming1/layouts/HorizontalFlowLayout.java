package lu.uni.programming1.layouts;

public class HorizontalFlowLayout extends Layout {

	public HorizontalFlowLayout(int nrOfComponents) {
		super(nrOfComponents);
	}
	
	@Override
	public void show() {
		for (int i=0 ; i<components.length ; ++i)
			System.out.print(components[i] + " ");
		System.out.println();
	}

}
