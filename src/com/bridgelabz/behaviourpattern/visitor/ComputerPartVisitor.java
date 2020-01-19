package com.bridgelabz.behaviourpattern.visitor;

public interface ComputerPartVisitor {

	void visit(Keyboard keyboard);

    void visit(Mouse mouse);
	
	void visit(Monitor moniter);

	void visit(Computer computer);

	
}
