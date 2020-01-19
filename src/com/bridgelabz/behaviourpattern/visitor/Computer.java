package com.bridgelabz.behaviourpattern.visitor;

public class Computer implements ComputerPart{
	ComputerPart part[];
	
	public Computer() {
		part = new ComputerPart[] {new Keyboard(),new Mouse(),new Monitor()};
	}
	@Override
	public void accept(ComputerPartVisitor cpv) {
		for(int i=0;i<part.length;i++)
		{
			part[i].accept(cpv);
		}
			
		cpv.visit(this);
		
	}

}
