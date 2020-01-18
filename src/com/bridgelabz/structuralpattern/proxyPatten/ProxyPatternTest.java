package com.bridgelabz.structuralpattern.proxyPatten;

public class ProxyPatternTest {
	public static void main(String[] args) {
		CommandExecutor executor = new CommandExecutorProxy("admeswrin", "admin123");
		try {
			executor.runnCommand("ls -ltr");
			executor.runnCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::"+e.getMessage());
		}
	}
}
