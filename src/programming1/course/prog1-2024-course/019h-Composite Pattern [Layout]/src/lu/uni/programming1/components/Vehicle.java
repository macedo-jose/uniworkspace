package lu.uni.programming1.components;

public class Vehicle extends Component {

	private int nrOfWheels;

	public Vehicle(String name, int nrOfWheels) {
		super(name);
		this.nrOfWheels = nrOfWheels;
	}

	@Override
	public void print() {
		System.out.print("vehicle '" + getName() + "' w/ " + nrOfWheels + " wheels");
	}

}
