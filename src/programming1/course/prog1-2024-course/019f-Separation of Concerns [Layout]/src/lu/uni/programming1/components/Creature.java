package lu.uni.programming1.components;

public class Creature extends Component {

	private int nrOfLegs;
	private double strength;
	
	public Creature(String name, int nrOfLegs, double strength) {
		super(name);
		this.nrOfLegs = nrOfLegs;
		this.strength = strength;
	}

	@Override
	public void print() {
		System.out.print("creature '" + getName() + "' w/ " + nrOfLegs + " legs and strength "+ strength);
	}

}
