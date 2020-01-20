package com.bridgelabz.behaviourpattern.visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	@Override
	public void visit(Keyboard keyboard) {
		System.out.println("Display keyboard ...");
	}

	@Override
	public void visit(Mouse mouse) {
		System.out.println("Display Mouse ");
	}

	@Override
	public void visit(Monitor moniter) {
		System.out.println("Display Moniter");
		
	}

	@Override
	public void visit(Computer computer) {
		System.out.println("Display Computer");
		
	}

}
