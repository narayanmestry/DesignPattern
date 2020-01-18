package com.bridgelabz.structuralpattern.proxyPatten;


public class CommandExecutorProxy implements CommandExecutor {
	private boolean isAdmin;
	private CommandExecutor executor ;
	
	public CommandExecutorProxy(String user ,String pwd)
	{
		if("admin".equalsIgnoreCase(user)&&"admin123".equalsIgnoreCase(pwd))
		{
			isAdmin = true;
		}
		executor = new CommandExecutorExample();
	}
	
	
	
	@Override
	public void runnCommand(String cmd) throws Exception {
		if(isAdmin)
		{
			executor.runnCommand(cmd);
		}
		else
		{
			if(cmd.trim().startsWith("rm")) 
			{
				throw new Exception("rm command is not allowed for non-admin users.");
			}
			else
			{
				executor.runnCommand(cmd);
			}
		}
	}
	
}
