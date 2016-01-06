package org.gradle;

import java.io.File;
import java.io.IOException;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;
import org.junit.Test;


public class Deligate {

	@Test
	public void foo() throws ExecuteException, IOException {
		CommandLine cmd = new CommandLine("cp");
		cmd.addArgument("d:\\a.txt");
		cmd.addArgument("e:\\temp\\a.txt");
		
		DefaultExecutor executor = new DefaultExecutor();
		executor.execute(cmd);
	}
}
