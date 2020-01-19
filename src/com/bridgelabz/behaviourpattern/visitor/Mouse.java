package com.bridgelabz.behaviourpattern.visitor;

public class Mouse implements ComputerPart{

	
	@Override
	public void accept(ComputerPartVisitor cpv) {
		cpv.visit(this);		
	}

}
