package lu.uni.programming1;

import lu.uni.programming1.components.Component;

public class Frame {
	
	private String title;
	private Component component;
	
	public Frame(String title, Component component) {
		this.title = title;
		this.component = component;
	}
	
	public void display() {
		System.out.println("---" + title + "---");
		component.print();
		System.out.println("--------------");
	}
	
}
