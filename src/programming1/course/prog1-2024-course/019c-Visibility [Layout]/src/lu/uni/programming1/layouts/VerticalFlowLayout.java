package lu.uni.programming1.layouts;

public class VerticalFlowLayout extends Layout {

	public VerticalFlowLayout(int nrOfComponents) {
		super(nrOfComponents);
	}
	
	public void show() {
		for (int i=0 ; i<components.length ; ++i)
			System.out.println(components[i]);
	}

}
