package com.bridgelabz.behaviourpattern.visitor;

public class Monitor implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor cpv) {
		cpv.visit(this);
	}

}
