package lu.uni.programming1;

import lu.uni.programming1.layouts.Layout;

public class Frame {
	
	private String title;
	private Layout layout;
	
	public Frame(String title, Layout layout) {
		this.title = title;
		this.layout = layout;
	}
	
	public void display() {
		System.out.println("---" + title + "---");
		layout.show();
		System.out.println("--------------");
	}
	
}
