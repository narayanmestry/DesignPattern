package com.bridgelabz.behaviourpattern.visitor;

public class Keyboard implements ComputerPart {
	public void accept(ComputerPartVisitor cpv) {
		cpv.visit(this);
	}

	
}
