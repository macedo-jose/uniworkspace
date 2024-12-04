package lu.uni.programming1;

public class Component {
	
	private String name;
	
	public Component(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
	public String getName() {
		return name;
	}
	
}
