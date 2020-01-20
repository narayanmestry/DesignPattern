package com.bridgelabz.behaviourpattern.visitor;

public class VisitorPatternTest {
	public static void main(String[] args) {
			ComputerPart computer = new Computer();
			computer.accept(new ComputerPartDisplayVisitor());
			
	}
}
