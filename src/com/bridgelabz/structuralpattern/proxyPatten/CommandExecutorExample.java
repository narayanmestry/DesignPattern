package com.bridgelabz.structuralpattern.proxyPatten;

public class CommandExecutorExample implements CommandExecutor {

	@Override
	public void runnCommand(String cmd) throws Exception {
		Runtime.getRuntime().exec(cmd);
		System.out.println("'"+cmd+"' Command is Executed .......");
	}
	
}
