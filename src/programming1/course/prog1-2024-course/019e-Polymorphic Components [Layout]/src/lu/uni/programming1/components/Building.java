package lu.uni.programming1.components;

public class Building extends Component {

	private int floors;
	
	public Building(String name, int floors) {
		super(name);
		this.floors = floors;
	}

	@Override
	public void print() {
		System.out.print("building '" + getName() + "' w/ " + floors + " floors");
	}

}
