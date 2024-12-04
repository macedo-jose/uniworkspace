package lu.uni.programming1;

public class Component {
	
	String name;
	
	public Component(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
}
