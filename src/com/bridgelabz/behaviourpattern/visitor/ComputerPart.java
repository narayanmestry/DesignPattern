package com.bridgelabz.behaviourpattern.visitor;

public interface ComputerPart {
	public void accept(ComputerPartVisitor cpv);
}
